package com.darkbright.demo;

import com.darkbright.demo.domain.entity.User;
import com.darkbright.demo.permission.dao.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

    @Autowired
    UserRepository userRepository;

    @Test
    public void contextLoads() {
        User user = userRepository.get(1);
        logger.info(user.toString());
    }
    
}
