package com.dais39.architecturesample.layer.infrastructure

import com.dais39.architecturesample.layer.domain.ToDo
import com.dais39.architecturesample.layer.domain.ToDoRepository
import org.springframework.stereotype.Repository

@Repository
class ToDoRepositoryImpl: ToDoRepository{

    override fun getToDo(): ToDo{
        return ToDo()
    }
}
