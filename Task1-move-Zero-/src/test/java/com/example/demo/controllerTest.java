package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class controllerTest {
    @Autowired
    private controller controller;

    @Test
    void Testexchange(){
        ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(0);
			al.add(3);
			al.add(4);
			al.add(0);
			al.add(1);
			al.add(2);
			al.add(5);
        controller.exchange(al);
}
	@Test
	void testHello(){
		controller.hello();
	}
}