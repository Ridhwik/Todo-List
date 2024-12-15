package com.project.ToDoList.ToDoController;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value = "add-todo" , method = RequestMethod.GET)
	public String showaddTodoPage() {
		
		
		
		return "Addtodo";
	}
	
	@RequestMapping(value = "add-todo" , method = RequestMethod.POST)
	public String addnewTodo(@RequestParam String description , ModelMap model) {
		
		String name = (String) model.get("name");
		
		
		todoService.addTodo(name, description, LocalDate.now().plusDays(10), false);
		
		return "redirect:list-todo";
	}
	
	
	
	
}
