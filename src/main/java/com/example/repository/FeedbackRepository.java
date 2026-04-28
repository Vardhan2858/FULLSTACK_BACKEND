package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}