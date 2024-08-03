package com.daisuzz.architecturesample.onion.application.application_service

import com.daisuzz.architecturesample.onion.application.domain_service.DomainService

class ApplicationServiceImpl(val domainService: DomainService) : ApplicationService
