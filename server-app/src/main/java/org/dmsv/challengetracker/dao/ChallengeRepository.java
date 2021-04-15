package org.dmsv.challengetracker.dao;

import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.dmsv.challengetracker.entity.Challenge;
import org.dmsv.challengetracker.entity.ChallengeTemplate;
import org.dmsv.challengetracker.mapper.ChallengeRowMapper;
import org.dmsv.challengetracker.mapper.ChallengeTemplateRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ChallengeRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Transactional
    public List<ChallengeTemplate> findAll() {
        return jdbcTemplate.query("select * from challenge",
                new ChallengeTemplateRowMapper());
    }

    @Transactional
    public List<Challenge> findFirstPublicOpen(int num) {
        return jdbcTemplate.query("SELECT C.*, ct.type FROM public.challenge c " +
                        "JOIN PUBLIC.challenge_type  ct ON c.challenge_type_id = ct.id " +
                        "                         where access='Y' and state = 'I' " +
                        "                         LIMIT  " + num,
                new ChallengeRowMapper());
    }
}
