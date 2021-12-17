package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class RestAPIController {
	/**
	 * Call Get method to return the text
	 * @return
	 */
	@RequestMapping(value = {"","/","/home"})
	public String index() {
		return "Hello from Bridgelabz...";
	}
}
