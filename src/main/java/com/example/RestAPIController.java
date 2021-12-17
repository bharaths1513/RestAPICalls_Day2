package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	/**
	 * Calling Get Request Method and pass name as query parameter
	 * localhost:8080/hello/query?name=Mark
	 * @param name
	 * @return
	 */
	@RequestMapping(value= {"/query"} , method = RequestMethod.GET)
	public String sayHello(@RequestParam(value= "name") String name){
		return "Hello" +" "+ name + " "+ "from Bridgelabz";
	}
}
