package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
public class controller {
	@PostMapping("/Int")
	public static List<Integer> exchange(@RequestBody ArrayList<Integer> al){
         List<Integer> result
				= Stream.concat(
				al.stream().filter(n -> n != 0), al.stream()
						.filter(n -> n == 0)).toList();
		System.out.println(" "+ result);
		return result;
	}
	@GetMapping("/get")
	public String hello()
	{
		return "hello";
	}
}
