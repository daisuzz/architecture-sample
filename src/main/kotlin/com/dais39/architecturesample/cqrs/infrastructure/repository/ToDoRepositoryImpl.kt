package com.dais39.architecturesample.cqrs.infrastructure.repository

import com.dais39.architecturesample.cqrs.domain.ToDo
import com.dais39.architecturesample.cqrs.domain.ToDoRepository
import org.springframework.stereotype.Repository

@Repository
class ToDoRepositoryImpl : ToDoRepository {

    override fun updateToDo(todo: ToDo) {
        println("update!!")
    }
}
