package com.dais39.architecturesample.cqrs.application.service

import com.dais39.architecturesample.cqrs.domain.ToDo
import com.dais39.architecturesample.cqrs.domain.ToDoRepository
import org.springframework.stereotype.Service

@Service
class ToDoServiceImpl(private val toDoRepository: ToDoRepository) : ToDoService{

    override fun registerTodo(todo: ToDo) {
        toDoRepository.updateToDo(todo)
    }
}
