package com.geekster.TodoApplication.repositeries;

import com.geekster.TodoApplication.models.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TodoRepo {
    List<Todo> todoList = new ArrayList<>();


    public List<Todo> getAllTodos() {

        return todoList;
    }

    public void saveTodo(Todo requestData) {
        todoList.add(requestData);

    }
}
