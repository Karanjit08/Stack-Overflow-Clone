package com.portal.demo.services;

import com.portal.demo.entitites.Question;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuestionService {

    ResponseEntity<Question> addQuestion(Question question);

    ResponseEntity<List<Question>> getAllQuestions();
}
