package com.dais39.architecturesample.cqrs.application.query

import com.dais39.architecturesample.cqrs.domain.ToDo

interface ToDoQueryService {

    fun getToDoList(): List<ToDo>
}
