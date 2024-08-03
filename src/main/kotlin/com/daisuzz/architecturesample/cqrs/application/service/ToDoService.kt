package com.daisuzz.architecturesample.cqrs.application.service

import com.daisuzz.architecturesample.cqrs.domain.ToDo

interface ToDoService {

    fun registerTodo(todo: com.daisuzz.architecturesample.cqrs.domain.ToDo)
}
