package com.dais39.architecturesample.hexagonal.application

class ApplicationServiceImpl(val domainService: DomainService) : ApplicationService
