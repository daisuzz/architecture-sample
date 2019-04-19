package com.dais39.architecturesample.clean.usecase

import com.dais39.architecturesample.layer.domain.ToDoService

class ApplicationServiceImpl(val domainService: ToDoService, val repository: Repository): ApplicationService
