package com.vm.spring.unit.test;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@GetMapping("/hello")
	public String sayHello(){
		return "hello shashank";
	}

	@GetMapping(value ="/student", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudent() {
		return new Student("shashank", 123);
	}



}