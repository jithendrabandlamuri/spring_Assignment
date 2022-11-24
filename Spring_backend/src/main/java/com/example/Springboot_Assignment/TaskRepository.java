package com.example.Springboot_Assignment;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,String>{
	
}