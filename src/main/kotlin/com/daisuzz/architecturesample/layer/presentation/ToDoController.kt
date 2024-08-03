package com.daisuzz.architecturesample.layer.presentation

import com.daisuzz.architecturesample.layer.application.ToDoApplicationService
import com.daisuzz.architecturesample.layer.domain.ToDo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ToDoController(val toDoApplicationService: ToDoApplicationService) {

    @GetMapping("/todo")
    fun getToDo(): ToDo {
        return toDoApplicationService.getToDo()
    }

    @GetMapping("/accounts/todo")
    fun getToDoWithAccount(): ToDo {
        return toDoApplicationService.getToDo()
    }
}
