package com.daisuzz.architecturesample.cqrs.application.query

import com.daisuzz.architecturesample.cqrs.domain.ToDo

interface ToDoQueryService {

    fun getToDoList(): List<com.daisuzz.architecturesample.cqrs.domain.ToDo>
}
