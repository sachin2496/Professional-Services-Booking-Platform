package net.javaguides.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


public class RatingDao {
    
    @Autowired
    private JdbcTemplate jdbctemplate;
    
   

}
