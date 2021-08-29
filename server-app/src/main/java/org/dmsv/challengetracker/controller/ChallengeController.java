package org.dmsv.challengetracker.controller;

import org.dmsv.challengetracker.dao.ChallengeRepository;
import org.dmsv.challengetracker.entity.Challenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/challenges")
public class ChallengeController {
    @Autowired
    private ChallengeRepository repository;


    @PutMapping(value = "/create-new")
    public Challenge templateList(@RequestBody Challenge challenge) {
        return null;
    }

    @GetMapping(value = "/create-new")
    public String newChallenge() {
        return "Ok";
    }


}
