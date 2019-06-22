package com.dais39.architecturesample.cqrs.infrastructure.dao

import com.dais39.architecturesample.cqrs.domain.ToDo

interface ToDoDao {

    fun findToDoList(): List<ToDo>
}
