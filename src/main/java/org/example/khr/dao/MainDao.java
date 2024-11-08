package org.example.khr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MainDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public MainDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> selectList() {
        String sqlStmt = "select * from aaa";
        return jdbcTemplate.queryForList(sqlStmt);
    }
}
