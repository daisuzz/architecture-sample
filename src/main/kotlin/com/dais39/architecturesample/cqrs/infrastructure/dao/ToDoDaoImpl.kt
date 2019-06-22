package com.dais39.architecturesample.cqrs.infrastructure.dao

import com.dais39.architecturesample.cqrs.domain.ToDo
import org.springframework.stereotype.Component

@Component
class ToDoDaoImpl : ToDoDao {

    override fun findToDoList(): List<ToDo> {
        return listOf(ToDo(), ToDo())
    }
}
