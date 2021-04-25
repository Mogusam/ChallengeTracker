package org.dmsv.challengetracker.controller;

import java.util.List;

import org.dmsv.challengetracker.dao.ChallengeRepository;
import org.dmsv.challengetracker.entity.Challenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/challenges")
public class ChallengeController {
    @Autowired
    private ChallengeRepository repository;


    //http://localhost:8090/challenges/first-open/3
    @GetMapping(value = "/first-open/{amount}")
    private List<Challenge> templateList(@PathVariable("amount") int amount) {
        return repository.findFirstPublicOpen(amount);
    }


}
