package com.example.Springboot_Assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskservice;
	
	@RequestMapping("/details")
	@CrossOrigin(origins = "http://localhost:8080")
	public List<Task> getAllDetails(){
		return taskservice.getAllDetails();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/add")
	@CrossOrigin(origins = "http://localhost:8080")
	public void addDetails(@RequestBody Task task) {
		taskservice.addDetails(task);
	}
}