package com.dais39.architecturesample.cqrs.application.query

import com.dais39.architecturesample.cqrs.domain.ToDo
import com.dais39.architecturesample.cqrs.infrastructure.dao.ToDoDao
import org.springframework.stereotype.Service

@Service
class ToDoQueryServiceImpl(private val toDoDao: ToDoDao) : ToDoQueryService{

    override fun getToDoList(): List<ToDo> {
        return toDoDao.findToDoList()
    }
}
