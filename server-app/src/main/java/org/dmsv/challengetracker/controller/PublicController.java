package org.dmsv.challengetracker.controller;

import java.util.List;

import org.dmsv.challengetracker.dao.ChallengeRepository;
import org.dmsv.challengetracker.entity.Challenge;
import org.dmsv.challengetracker.entity.ChallengeTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PublicController {

    @Autowired
    private ChallengeRepository repository;

    @PostMapping(value = "/login")
    private List<ChallengeTemplate> login() {
        return null;
    }

    //http://localhost:8090/challenges/first-open/3
    @GetMapping(value = "/challenges/first-open/{amount}")
    private List<Challenge> templateList(@PathVariable("amount") int amount) {
        return repository.findFirstPublicOpen(amount);
    }

}
