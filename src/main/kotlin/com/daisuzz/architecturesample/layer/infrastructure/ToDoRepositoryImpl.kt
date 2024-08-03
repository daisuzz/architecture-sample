package com.daisuzz.architecturesample.layer.infrastructure

import com.daisuzz.architecturesample.layer.domain.ToDo
import com.daisuzz.architecturesample.layer.domain.ToDoRepository
import org.springframework.stereotype.Repository

@Repository
class ToDoRepositoryImpl : ToDoRepository {

    override fun getToDo(): ToDo {
        return ToDo()
    }
}
