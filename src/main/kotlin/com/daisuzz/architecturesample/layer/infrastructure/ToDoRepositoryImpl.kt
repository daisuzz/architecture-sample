package com.daisuzz.architecturesample.layer.infrastructure

import com.daisuzz.architecturesample.layer.domain.ToDo
import com.daisuzz.architecturesample.layer.domain.ToDoRepository
import org.springframework.stereotype.Repository

@Repository
class ToDoRepositoryImpl: com.daisuzz.architecturesample.layer.domain.ToDoRepository {

    override fun getToDo(): com.daisuzz.architecturesample.layer.domain.ToDo {
        return com.daisuzz.architecturesample.layer.domain.ToDo()
    }
}
