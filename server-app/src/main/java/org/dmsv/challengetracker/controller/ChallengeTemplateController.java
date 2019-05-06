package org.dmsv.challengetracker.controller;

import java.util.List;

import org.dmsv.challengetracker.dao.ChallengeTemplateRepository;
import org.dmsv.challengetracker.entity.ChallengeTemplate;
import org.dmsv.challengetracker.service.ChallengeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChallengeTemplateController {

    @Autowired
    private ChallengeTemplateService templateService;

    @GetMapping(value = "/templates")
    private List<ChallengeTemplate> templateList() {
        return templateService.getAllTemplates();
    }
}
