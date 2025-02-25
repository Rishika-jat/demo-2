package com.javatechie.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    void testAddNumbers() {
        int result = myService.addNumbers(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }
}
