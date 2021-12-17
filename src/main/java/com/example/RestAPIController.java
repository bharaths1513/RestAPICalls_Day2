package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;



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
	
	
	/**
	 * Calling Get Request method and pass name as path variable
	 * localhost:8080/hello/param/Mark -w "/n"
	 * @param name
	 * @return
	 */
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello"+" " + name +" "+ "from Bridgelabz"; 
	}
	
	
	/**
	 * Call Post Request Method and pass first name and last name in Body
	 * localhost:8080/hello/post -w "/n"
	 * @param user
	 * @return
	 */
	@PostMapping("/post")
	public String postData(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName();	
	}
}
