package com.portal.demo.dao;

import com.portal.demo.entitites.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerDao extends JpaRepository<Answer,Integer> {
    List<Answer> findByQuestionId(int questionId);
}
