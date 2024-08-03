package com.daisuzz.architecturesample.layer.application

import com.daisuzz.architecturesample.layer.domain.ToDo

interface ToDoApplicationService{

    fun getToDo(): com.daisuzz.architecturesample.layer.domain.ToDo
}
