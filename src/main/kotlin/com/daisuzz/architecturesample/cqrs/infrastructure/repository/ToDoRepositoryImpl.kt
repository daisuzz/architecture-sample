package com.daisuzz.architecturesample.cqrs.infrastructure.repository

import com.daisuzz.architecturesample.cqrs.domain.ToDo
import com.daisuzz.architecturesample.cqrs.domain.ToDoRepository
import org.springframework.stereotype.Repository

@Repository
class ToDoRepositoryImpl : ToDoRepository {

    override fun updateToDo(todo: ToDo) {
        println("update!!")
    }
}
