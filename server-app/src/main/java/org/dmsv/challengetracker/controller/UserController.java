package org.dmsv.challengetracker.controller;

import java.util.List;

import org.dmsv.challengetracker.entity.ChallengeTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @PostMapping(value = "/login")
    private List<ChallengeTemplate> login() {
        return null;
    }
}
