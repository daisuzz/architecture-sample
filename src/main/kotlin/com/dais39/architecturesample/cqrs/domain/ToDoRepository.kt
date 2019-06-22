package com.dais39.architecturesample.cqrs.domain

interface ToDoRepository {

    fun updateToDo(todo: ToDo)
}
