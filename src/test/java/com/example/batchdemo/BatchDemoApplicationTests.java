package com.example.batchdemo;

import com.example.batchdemo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BatchDemoApplicationTests {

    @Autowired
    UserRepository userRepository;
    @Test
    void contextLoads() {
        System.out.println(userRepository.findById(1).get());
    }

}
