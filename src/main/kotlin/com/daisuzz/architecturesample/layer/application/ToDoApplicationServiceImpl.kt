package com.daisuzz.architecturesample.layer.application

import com.daisuzz.architecturesample.layer.domain.ToDo
import com.daisuzz.architecturesample.layer.domain.ToDoService
import org.springframework.stereotype.Service

@Service
class ToDoApplicationServiceImpl(
    val toDoService: com.daisuzz.architecturesample.layer.domain.ToDoService
) : com.daisuzz.architecturesample.layer.application.ToDoApplicationService {

    override fun getToDo(): com.daisuzz.architecturesample.layer.domain.ToDo {
        return toDoService.getToDo()
    }
}
