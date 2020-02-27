package com.josep.fakeapi.services

import com.josep.fakeapi.entities.Acquirer
import com.josep.fakeapi.repository.AcquirerRepository
import org.springframework.stereotype.Service

@Service
class AcquirerService(val acquirerRepository: AcquirerRepository) {
    fun getListAcquirer() = acquirerRepository.findAll()
    fun insertAcquirer(acquirer: Acquirer) = acquirerRepository.save(acquirer)
}
