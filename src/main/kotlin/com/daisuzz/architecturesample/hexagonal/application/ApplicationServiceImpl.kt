package com.daisuzz.architecturesample.hexagonal.application

class ApplicationServiceImpl(val domainService: com.daisuzz.architecturesample.hexagonal.application.DomainService) :
    com.daisuzz.architecturesample.hexagonal.application.ApplicationService
