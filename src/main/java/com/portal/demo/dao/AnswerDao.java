package com.portal.demo.dao;

import com.portal.demo.entitites.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerDao extends JpaRepository<Answer,Integer> {
}
