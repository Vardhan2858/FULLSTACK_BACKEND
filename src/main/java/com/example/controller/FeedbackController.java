package com.example.controller;

import java.util.Map;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.model.Feedback;
import com.example.service.FeedbackService;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "http://localhost:5173")
public class FeedbackController {

    private final FeedbackService service;

    public FeedbackController(FeedbackService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> submitFeedback(@Valid @RequestBody Feedback feedback) {
        Feedback saved = service.save(feedback);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
            "message", "Feedback submitted successfully",
            "id", saved.getId()
        ));
    }

    @GetMapping
    public Iterable<Feedback> getAllFeedback() {
        return service.findAll();
    }
}