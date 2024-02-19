package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping("getdata")
	public String m1() {
		System.out.println("get -----");
		return "fisa man";
	}
}
