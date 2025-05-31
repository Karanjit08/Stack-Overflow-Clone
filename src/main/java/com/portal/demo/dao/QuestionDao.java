package com.portal.demo.dao;

import com.portal.demo.entitites.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDao extends JpaRepository<Question,Integer> {
}
