package com.geekster.TodoApplication.service;

import com.geekster.TodoApplication.models.Todo;
import com.geekster.TodoApplication.repositeries.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class TodoService {
    @Autowired
    TodoRepo todoDaoRepository;


    public List<Todo> getALLTodosInMyList()
    {
        return todoDaoRepository.getAllTodos();

    }


    public void saveTodo(Todo requestData) {
        todoDaoRepository.saveTodo(requestData);
    }

}
