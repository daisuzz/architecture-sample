package com.daisuzz.architecturesample.hexagonal.application

class DomainServiceImpl(val repository: com.daisuzz.architecturesample.hexagonal.application.Repository) :
    com.daisuzz.architecturesample.hexagonal.application.DomainService
