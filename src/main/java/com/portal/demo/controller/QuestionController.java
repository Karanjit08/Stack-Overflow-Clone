package com.portal.demo.controller;


import com.portal.demo.entitites.Question;
import com.portal.demo.services.QuestionService;
import com.portal.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private UserService userService;

    @Autowired
    private QuestionService questionService;

    @PostMapping("/addQuestion")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
        return this.questionService.addQuestion(question);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return this.questionService.getAllQuestions();
    }
}
