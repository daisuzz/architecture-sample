package com.dais39.architecturesample.onion.application.application_service

import com.dais39.architecturesample.onion.application.domain_service.DomainService

class ApplicationServiceImpl(val domainService: DomainService) : ApplicationService
