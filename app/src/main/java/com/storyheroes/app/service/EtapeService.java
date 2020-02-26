package com.storyheroes.app.service;

import com.storyheroes.app.model.Etape;
import com.storyheroes.app.model.Histoire;
import com.storyheroes.app.repository.EtapeRepository;
import com.storyheroes.app.repository.Histoire_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EtapeService {

    //Déclaration des repository
    @Autowired
    private EtapeRepository etapeRepo;
    @Autowired
    private Histoire_Repository histoire_repository;


    public List<Etape> getEtapesByStory(Long idHistoire) {
        return histoire_repository.findById(idHistoire).get().getEtapes();
    }

}
