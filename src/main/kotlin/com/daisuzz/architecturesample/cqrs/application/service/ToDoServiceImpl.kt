package com.daisuzz.architecturesample.cqrs.application.service

import com.daisuzz.architecturesample.cqrs.domain.ToDo
import com.daisuzz.architecturesample.cqrs.domain.ToDoRepository
import org.springframework.stereotype.Service

@Service
class ToDoServiceImpl(private val toDoRepository: ToDoRepository) : ToDoService {

    override fun registerTodo(todo: ToDo) {
        toDoRepository.updateToDo(todo)
    }
}
