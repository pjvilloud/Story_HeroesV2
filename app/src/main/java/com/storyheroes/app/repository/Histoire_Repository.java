package com.storyheroes.app.repository;

import com.storyheroes.app.model.Histoire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Histoire_Repository extends JpaRepository<Histoire, Long> {



    List<Histoire> findByTitreContaining(String titre);
}
