package com.daisuzz.architecturesample.cqrs.presentation

import com.daisuzz.architecturesample.cqrs.application.query.ToDoQueryService
import com.daisuzz.architecturesample.cqrs.application.service.ToDoService
import com.daisuzz.architecturesample.cqrs.domain.ToDo
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
