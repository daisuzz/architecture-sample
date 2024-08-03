package com.daisuzz.architecturesample.cqrs.infrastructure.dao

import com.daisuzz.architecturesample.cqrs.domain.ToDo

interface ToDoDao {

    fun findToDoList(): List<com.daisuzz.architecturesample.cqrs.domain.ToDo>
}
