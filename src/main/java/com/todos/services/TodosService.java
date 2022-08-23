package com.todos.services;

import java.util.List;

import com.todos.models.Todo;

public interface TodosService {
	
	List<Todo> getAllTodos();
	
	List<Todo> getTodosByUser(String user);
	
	Todo getTodoById(int id);
	
	Todo addTodo(Todo todo);
	
	Todo updateTodo( int id, Todo todo);
	
	boolean deleteTodo(int id);

}
