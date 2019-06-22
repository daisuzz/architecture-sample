package com.dais39.architecturesample.layer.application

import com.dais39.architecturesample.layer.domain.ToDo
import com.dais39.architecturesample.layer.domain.ToDoService
import org.springframework.stereotype.Service

@Service
class ToDoApplicationServiceImpl(
    val toDoService: ToDoService
) : ToDoApplicationService {

    override fun getToDo(): ToDo {
        return toDoService.getToDo()
    }
}
