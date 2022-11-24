package com.example.Springboot_Assignment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public void addDetails(Task task) {
		taskRepository.save(task);
	}
	
	public List<Task> getAllDetails(){
		//return all details;
		List<Task> details=new ArrayList<>();
		taskRepository.findAll()
		.forEach(details::add);
		return details;
	}
	
}