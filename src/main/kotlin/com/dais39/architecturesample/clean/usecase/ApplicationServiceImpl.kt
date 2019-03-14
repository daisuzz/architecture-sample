package com.dais39.architecturesample.clean.usecase

import com.dais39.architecturesample.layer.domain.DomainService

class ApplicationServiceImpl(val domainService: DomainService, val repository: Repository): ApplicationService
