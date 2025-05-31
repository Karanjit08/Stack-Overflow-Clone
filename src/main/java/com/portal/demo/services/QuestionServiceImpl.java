package com.portal.demo.services;


import com.portal.demo.dao.QuestionDao;
import com.portal.demo.entitites.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;


    @Override
    public ResponseEntity<Question> addQuestion(Question question) {
        return new ResponseEntity<>(questionDao.save(question),HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<Question>> getAllQuestions() {
        return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
    }
}
