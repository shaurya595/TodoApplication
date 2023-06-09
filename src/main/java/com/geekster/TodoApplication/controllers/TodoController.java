package com.geekster.TodoApplication.controllers;

import com.geekster.TodoApplication.models.Todo;
import com.geekster.TodoApplication.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class TodoController {
    @Autowired
    TodoService todoService;

    @PostMapping(value = "/saveTodo")
    public String saveTodo(@RequestBody Todo requestData) {

        todoService.saveTodo(requestData);
        return "saved";
    }


    @GetMapping(value = "/getTodos")
    public List<Todo> getAllTodos()
    {
        return todoService.getALLTodosInMyList();
    }

}
