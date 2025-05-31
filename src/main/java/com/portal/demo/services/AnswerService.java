package com.portal.demo.services;

import com.portal.demo.entitites.Answer;
import org.springframework.http.ResponseEntity;


public interface AnswerService {
    ResponseEntity<Answer> postAnswer(Answer answer, int userId, int questionId);
}
