package com.daisuzz.architecturesample.layer.application

import com.daisuzz.architecturesample.layer.domain.ToDoService
import org.springframework.stereotype.Service

@Service
class ToDoApplicationServiceImpl(
    val toDoService: ToDoService
) : ToDoApplicationService {

    override fun getToDo(): com.daisuzz.architecturesample.layer.domain.ToDo {
        return toDoService.getToDo()
    }
}
