package com.daisuzz.architecturesample.cqrs.domain

interface ToDoRepository {

    fun updateToDo(todo: com.daisuzz.architecturesample.cqrs.domain.ToDo)
}
