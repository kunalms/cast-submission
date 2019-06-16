package com.example.casthiring.casthiring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/submission")
public class Submission {

    private Logger logger = LoggerFactory.getLogger(Submission.class);

    @GetMapping()
    public String handleSubmission() {
        logger.info("Submission done");
        return "Hello world";
    }
}
