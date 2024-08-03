package com.daisuzz.architecturesample.hexagonal.application

class ApplicationServiceImpl(val domainService: DomainService) : ApplicationService
