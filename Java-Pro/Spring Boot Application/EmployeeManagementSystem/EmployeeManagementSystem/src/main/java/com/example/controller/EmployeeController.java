package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {

	@PostMapping(value="/demo")
	public ResponseEntity<String> created(){
		return new ResponseEntity<String>("Welcome",HttpStatus.CREATED);
	}
	
	@PostMapping(value="/demo")
	public ResponseEntity<String> accepted(){
		return new ResponseEntity<String>("Welcome",HttpStatus.ACCEPTED);
	}
	
	/*
	 * http:localhost:8080
	 */
	@GetMapping(value="/")
	public String welcome() {
		
		String msg = "<h3 style='color:red;text-align:center'>Welcome to Spring Boot";
		return msg;
	}
	
	/*
	 * http:localhost:8080/employee
	 */
	@GetMapping(value="/")
	public String employee() {
		
		String msg = "<h3 style='color:red;text-align:center'>Welcome to Spring Boot employee page";
		return msg;
	}
	
	@PostMapping
	public String logic() {
		String msg = "<h3 style='color:yello;text-aligh:center'>Welcome user";
		return msg;
	}
	
	@DeleteMapping(value="/deleteEmployee")
	public String delete() {
		String msg = "Employee Deleted";
		return msg;
	}
	
	@PatchMapping(value="/updating")
	public String update() {
		String msg = "partial update";
		return msg;
	}
	
	@PutMapping(value="/updateall")
	public String updateAll() {
		String msg = "Updating all";
		return msg;
	}
}
