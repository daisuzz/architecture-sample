package com.daisuzz.architecturesample.cqrs.application.query

import com.daisuzz.architecturesample.cqrs.domain.ToDo
import com.daisuzz.architecturesample.cqrs.infrastructure.dao.ToDoDao
import org.springframework.stereotype.Service

@Service
class ToDoQueryServiceImpl(private val toDoDao: ToDoDao) : ToDoQueryService {

    override fun getToDoList(): List<ToDo> {
        return toDoDao.findToDoList()
    }
}
