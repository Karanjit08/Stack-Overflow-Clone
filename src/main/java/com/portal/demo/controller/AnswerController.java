package com.portal.demo.controller;


import com.portal.demo.entitites.Answer;
import com.portal.demo.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answers")
public class AnswerController {


    @Autowired
    private AnswerService answerService;

    @PostMapping("/post")
    public ResponseEntity<Answer> postAnswer(@RequestBody Answer answer,
                                             @RequestParam int userId,
                                             @RequestParam int questionId) {
        return answerService.postAnswer(answer, userId, questionId);
    }

}
