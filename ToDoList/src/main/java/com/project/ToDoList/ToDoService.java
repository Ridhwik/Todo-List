package com.project.ToDoList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ToDoService {
	
	private static List<ToDo> todo  = new ArrayList<>();
	
	static {
		todo.add(new ToDo(1, "Syfer" , "Learning SpringBoot" , LocalDate.now().plusYears(1) , false));
		todo.add(new ToDo(2, "Syfer" , "Learning AWS" , LocalDate.now().plusYears(2) , false));
		todo.add(new ToDo(3, "Syfer" , "Learning Development" , LocalDate.now().plusYears(3) , false));
		
	}
	
	public List<ToDo> findbyUser(String UserName){
		
		return todo;
	}

}
