package org.dmsv.challengetracker.dao;

import org.dmsv.challengetracker.entity.ChallengeTemplate;
import org.dmsv.challengetracker.mapper.ChallengeTemplateRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ChallengeTemplateRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Transactional
    public List<ChallengeTemplate> findAll() {
        return jdbcTemplate.query("select * from challenge_template",
                new ChallengeTemplateRowMapper());
    }
}
