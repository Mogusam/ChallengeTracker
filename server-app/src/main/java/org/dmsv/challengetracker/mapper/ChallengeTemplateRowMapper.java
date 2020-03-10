package org.dmsv.challengetracker.mapper;

import org.dmsv.challengetracker.entity.ChallengeTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChallengeTemplateRowMapper implements RowMapper<ChallengeTemplate> {

    @Override
    public ChallengeTemplate mapRow(ResultSet rs, int rowNum) throws SQLException {
        ChallengeTemplate template = new ChallengeTemplate();
        template.setId(rs.getInt("template_id"));
        template.setName(rs.getString("template_name"));
        template.setDescription(rs.getString("template_description"));
        template.setSettings(rs.getString("template_settings"));

        return template;
    }
}
