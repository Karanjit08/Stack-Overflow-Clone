package com.portal.demo.services;

import com.portal.demo.entitites.Answer;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface AnswerService {
    ResponseEntity<Answer> postAnswer(Answer answer, int userId, int questionId);

    List<Answer> getAnswersByQuestionId(int questionId);
}
