package com.daisuzz.architecturesample.clean.usecase

import com.daisuzz.architecturesample.layer.domain.ToDoService

class ApplicationServiceImpl(
    val domainService: ToDoService,
    val repository: Repository
) : ApplicationService
