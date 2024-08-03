package com.daisuzz.architecturesample.layer.query

import com.daisuzz.architecturesample.layer.domain.ToDo

interface ToDoQueryService{

    fun getToDoWithAccount(): com.daisuzz.architecturesample.layer.domain.ToDo
}
