package com.josep.fakeapi.controllers

import com.josep.fakeapi.entities.Acquirer
import com.josep.fakeapi.services.AcquirerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/acquirer")
class AcquirerController(val acquirerService: AcquirerService) {
    @GetMapping("")
    fun getAcquirer() = acquirerService.getListAcquirer()

    @PostMapping("")
    fun postAcquirer(@RequestBody acquirer: Acquirer): Acquirer {
        return acquirerService.insertAcquirer(acquirer)
    }
}
