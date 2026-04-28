package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Feedback;
import com.example.repository.FeedbackRepository;

@Service
public class FeedbackService {

    private final FeedbackRepository repo;

    public FeedbackService(FeedbackRepository repo) {
        this.repo = repo;
    }

    public Feedback save(Feedback feedback) {
        return repo.save(feedback);
    }

    public List<Feedback> findAll() {
        return repo.findAll();
    }
}
