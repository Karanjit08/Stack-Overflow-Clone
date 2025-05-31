package com.portal.demo.services;

import com.portal.demo.dao.AnswerDao;
import com.portal.demo.dao.QuestionDao;
import com.portal.demo.dao.UserDao;
import com.portal.demo.entitites.Answer;
import com.portal.demo.entitites.Question;
import com.portal.demo.entitites.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private QuestionDao questionDao;

    @Override
    public ResponseEntity<Answer> postAnswer(Answer answer, int userId, int questionId) {
        Optional<UserProfile> userOptional = userDao.findById(userId);
        Optional<Question> questionOptional = questionDao.findById(questionId);

        if (userOptional.isEmpty() || questionOptional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        UserProfile user = userOptional.get();
        Question question = questionOptional.get();

        answer.setUser(user);
        answer.setQuestion(question);

        // Save answer
        Answer savedAnswer = answerDao.save(answer);

        // Update user's contribution streak
        user.setContributionStreak(user.getContributionStreak() + 1);
        userDao.save(user);  // persist the update

        return new ResponseEntity<>(savedAnswer, HttpStatus.CREATED);
    }
}
