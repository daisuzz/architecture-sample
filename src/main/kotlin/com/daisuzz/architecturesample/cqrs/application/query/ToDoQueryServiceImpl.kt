package com.daisuzz.architecturesample.cqrs.application.query

import com.daisuzz.architecturesample.cqrs.domain.ToDo
import com.daisuzz.architecturesample.cqrs.infrastructure.dao.ToDoDao
import org.springframework.stereotype.Service

@Service
class ToDoQueryServiceImpl(private val toDoDao: com.daisuzz.architecturesample.cqrs.infrastructure.dao.ToDoDao) :
    com.daisuzz.architecturesample.cqrs.application.query.ToDoQueryService {

    override fun getToDoList(): List<com.daisuzz.architecturesample.cqrs.domain.ToDo> {
        return toDoDao.findToDoList()
    }
}
