package org.dmsv.challengetracker.service;

import java.util.List;

import org.dmsv.challengetracker.dao.ChallengeTemplateRepository;
import org.dmsv.challengetracker.entity.ChallengeTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChallengeTemplateService {

    @Autowired
    private ChallengeTemplateRepository repository;

    public List<ChallengeTemplate> getAllTemplates(){
        return repository.findAll();
    }
}
