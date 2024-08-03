package com.daisuzz.architecturesample.layer.domain

import org.springframework.stereotype.Service

@Service
class ToDoServiceImpl(val repository: com.daisuzz.architecturesample.layer.domain.ToDoRepository) :
    com.daisuzz.architecturesample.layer.domain.ToDoService {

    override fun getToDo(): com.daisuzz.architecturesample.layer.domain.ToDo {
        return repository.getToDo()
    }
}
