package org.dmsv.challengetracker.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dmsv.challengetracker.entity.Challenge;
import org.dmsv.challengetracker.entity.enums.Access;
import org.dmsv.challengetracker.entity.enums.ChallengeState;
import org.dmsv.challengetracker.entity.enums.StopStrategy;
import org.springframework.jdbc.core.RowMapper;

public class ChallengeRowMapper implements RowMapper<Challenge> {

    @Override
    public Challenge mapRow(ResultSet rs, int rowNum) throws SQLException {
        Challenge challenge = new Challenge();
        challenge.setId(rs.getInt("id"));
        challenge.setTemplateId(rs.getInt("template_id"));
        challenge.setStartDate(rs.getDate("start_date").toLocalDate());
        challenge.setEndDate(rs.getDate("end_date").toLocalDate());
        challenge.setAccess(Access.get(rs.getString("access")));
        challenge.setStopStrategy(StopStrategy.get(rs.getString("stop_strategy")));
        challenge.setState(ChallengeState.get(rs.getString("state")));
        challenge.setModerated(rs.getBoolean("moderated"));
        challenge.setSettings(rs.getString("challenge_settings"));
        challenge.setTypeId(rs.getInt("challenge_type_id"));
        challenge.setType(rs.getString("type"));

        return challenge;
    }
}
