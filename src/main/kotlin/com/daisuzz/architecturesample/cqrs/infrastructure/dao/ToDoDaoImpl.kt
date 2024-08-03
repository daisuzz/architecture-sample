package com.daisuzz.architecturesample.cqrs.infrastructure.dao

import com.daisuzz.architecturesample.cqrs.domain.ToDo
import org.springframework.stereotype.Component

@Component
class ToDoDaoImpl : com.daisuzz.architecturesample.cqrs.infrastructure.dao.ToDoDao {

    override fun findToDoList(): List<com.daisuzz.architecturesample.cqrs.domain.ToDo> {
        return listOf(
            com.daisuzz.architecturesample.cqrs.domain.ToDo(),
            com.daisuzz.architecturesample.cqrs.domain.ToDo()
        )
    }
}
