package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class controllerTest {
    @Autowired
    private controller controller;

    @Test
    void Testexchange(){
        controller.exchange(new int[]{1, 6, 7, 0, 8 ,4 ,0});
}
}