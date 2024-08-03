package com.daisuzz.architecturesample.cqrs.domain

interface ToDoRepository {

    fun updateToDo(todo: ToDo)
}
