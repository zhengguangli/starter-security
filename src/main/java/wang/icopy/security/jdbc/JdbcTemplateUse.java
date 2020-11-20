package wang.icopy.security.jdbc;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JdbcTemplateUse {

    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplateUse(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
