package com.dais39.architecturesample.cqrs.application.service

import com.dais39.architecturesample.cqrs.domain.ToDo

interface ToDoService {

    fun registerTodo(todo: ToDo)
}
