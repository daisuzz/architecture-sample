package com.dais39.architecturesample.layer.application

import com.dais39.architecturesample.layer.domain.ToDo

interface ToDoApplicationService{

    fun getToDo(): ToDo
}
