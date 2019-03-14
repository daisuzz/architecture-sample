package com.dais39.architecturesample.layer.application

import com.dais39.architecturesample.layer.domain.DomainService

class ApplicationServiceImpl(val domainService: DomainService) : ApplicationService
