package com.dais39.architecturesample.layer.domain

import org.springframework.stereotype.Service

@Service
class ToDoServiceImpl(val repository: ToDoRepository) : ToDoService{

    override fun getToDo(): ToDo{
        return repository.getToDo()
    }
}
