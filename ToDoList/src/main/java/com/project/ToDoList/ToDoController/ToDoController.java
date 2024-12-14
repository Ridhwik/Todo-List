package com.project.ToDoList.ToDoController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project.ToDoList.ToDo;
import com.project.ToDoList.ToDoService;


@Controller
@SessionAttributes("name")
public class ToDoController {
	
	@Autowired
	private ToDoService todoService;
	
	
	@RequestMapping("list-todo")
	public String listAllTodo(ModelMap model) {
		List<ToDo> list = todoService.findbyUser("Syfer");
		model.addAttribute("todo", list);
		
		return "todo";
	}
	
	
	
}
