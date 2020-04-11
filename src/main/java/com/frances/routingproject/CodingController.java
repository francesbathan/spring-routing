package com.frances.routingproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping ("/coding")
public class CodingController {
	@RequestMapping(value="", method=RequestMethod.GET)
	public String index() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping(value="/python", method=RequestMethod.GET)
	public String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping(value="/java", method=RequestMethod.GET)
	public String java() {
		return "Java/Spring is better!";
	}
}
