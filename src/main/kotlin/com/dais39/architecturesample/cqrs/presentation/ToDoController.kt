package com.dais39.architecturesample.cqrs.presentation

import com.dais39.architecturesample.cqrs.application.query.ToDoQueryService
import com.dais39.architecturesample.cqrs.application.service.ToDoService
import com.dais39.architecturesample.cqrs.domain.ToDo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ToDoController(
    private val toDoQueryService: ToDoQueryService,
    private val toDoService: ToDoService
) {

    @GetMapping("/todo")
    fun getToDoList() = toDoQueryService.getToDoList()

    @PostMapping("/todo")
    fun updateToDo(toDo: ToDo) = toDoService.registerTodo(toDo)
}
