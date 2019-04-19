package com.dais39.architecturesample.layer.infrastructure

import com.dais39.architecturesample.layer.domain.ToDo
import com.dais39.architecturesample.layer.query.ToDoQueryService
import org.springframework.stereotype.Service

@Service
class ToDoQueryServiceImpl : ToDoQueryService{

    override fun getToDoWithAccount(): ToDo {
        return ToDo()
    }
}
