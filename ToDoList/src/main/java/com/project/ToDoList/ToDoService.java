package com.project.ToDoList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class ToDoService {
	
	private static List<ToDo> todo  = new ArrayList<>();
	public static int CountID = 0;
	
	static {
		todo.add(new ToDo(++CountID, "Syfer" , "Learning SpringBoot" , LocalDate.now().plusYears(1) , false));
		todo.add(new ToDo(++CountID, "Syfer" , "Learning AWS" , LocalDate.now().plusYears(2) , false));
		todo.add(new ToDo(++CountID, "Syfer" , "Learning Development" , LocalDate.now().plusYears(3) , false));
		
	}
	
	public List<ToDo> findbyUser(String UserName){
		
		return todo;
	}
	
	public void addTodo(String UserName , String description , LocalDate localdate, boolean done){
		ToDo TODO = new ToDo(++CountID, UserName, description, localdate, done);
		
		todo.add(TODO);
		
	}

	

}
