package com.translator.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.client.RestTemplate;
import org.springframework.ui.Model;
import com.translator.model.TranslationRequest;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class TranslatorController {

    private static final Logger logger = LoggerFactory.getLogger(TranslatorController.class);

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/translate")
    @ResponseBody
    public ResponseEntity<String> translate(@Valid @RequestBody TranslationRequest request,
                                            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest()
                    .body("{\"error\": \"Validation failed: " +
                            bindingResult.getAllErrors().get(0).getDefaultMessage() + "\"}");
        }

        try {
            logger.info("Translation request: {}", request);

            String encodedText = java.net.URLEncoder.encode(request.getText(), "UTF-8");
            String url = String.format(
                    "https://api.mymemory.translated.net/get?q=%s&langpair=%s|%s",
                    encodedText, request.getFromLang(), request.getToLang()
            );

            logger.info("Translation API URL: {}", url);

            String response = restTemplate.getForObject(url, String.class);

            logger.info("Translation API response: {}", response);

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            logger.error("Translation service error: {}", e.getMessage(), e);

            return ResponseEntity
                    .status(500)
                    .body("{\"responseStatus\":\"500\"," +
                            "\"responseData\":{\"translatedText\":\"Translation service error: " +
                            e.getMessage() + "\"}}");
        }
    }
}
