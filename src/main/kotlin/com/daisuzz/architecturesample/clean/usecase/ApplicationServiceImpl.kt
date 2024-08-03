package com.daisuzz.architecturesample.clean.usecase

import com.daisuzz.architecturesample.layer.domain.ToDoService

class ApplicationServiceImpl(val domainService: com.daisuzz.architecturesample.layer.domain.ToDoService, val repository: com.daisuzz.architecturesample.clean.usecase.Repository):
    com.daisuzz.architecturesample.clean.usecase.ApplicationService
