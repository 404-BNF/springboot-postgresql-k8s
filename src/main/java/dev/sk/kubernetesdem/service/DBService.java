package dev.sk.kubernetesdem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public Integer testData(){
        return jdbcTemplate.queryForObject("select count(*) from test_db", Integer.class);
    }
    public int createRecord(String status){
        return jdbcTemplate.update("insert into test_db(status) values(?)", status);
    }

}
