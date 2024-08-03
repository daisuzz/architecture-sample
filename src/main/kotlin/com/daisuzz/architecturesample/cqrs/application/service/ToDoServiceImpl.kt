package com.daisuzz.architecturesample.cqrs.application.service

import com.daisuzz.architecturesample.cqrs.domain.ToDo
import com.daisuzz.architecturesample.cqrs.domain.ToDoRepository
import org.springframework.stereotype.Service

@Service
class ToDoServiceImpl(private val toDoRepository: com.daisuzz.architecturesample.cqrs.domain.ToDoRepository) :
    com.daisuzz.architecturesample.cqrs.application.service.ToDoService {

    override fun registerTodo(todo: com.daisuzz.architecturesample.cqrs.domain.ToDo) {
        toDoRepository.updateToDo(todo)
    }
}
