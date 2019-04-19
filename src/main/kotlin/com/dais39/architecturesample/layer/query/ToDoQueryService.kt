package com.dais39.architecturesample.layer.query

import com.dais39.architecturesample.layer.domain.ToDo

interface ToDoQueryService{

    fun getToDoWithAccount(): ToDo
}
