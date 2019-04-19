package com.dais39.architecturesample.layer.application

import com.dais39.architecturesample.layer.domain.ToDo
import com.dais39.architecturesample.layer.domain.ToDoService
import com.dais39.architecturesample.layer.query.ToDoQueryService
import org.springframework.stereotype.Service

@Service
class ToDoApplicationServiceImpl(
    val toDoService: ToDoService,
    val todoQueryService: ToDoQueryService
) : ToDoApplicationService{

    override fun getToDo(): ToDo{
        return toDoService.getToDo()
    }

    override fun getToDoWithAccount(): ToDo {
        return todoQueryService.getToDoWithAccount()
    }
}
