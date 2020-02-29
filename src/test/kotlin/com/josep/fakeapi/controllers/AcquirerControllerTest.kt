package com.josep.fakeapi.controllers

import com.josep.fakeapi.entities.Acquirer
import com.josep.fakeapi.services.AcquirerService
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
internal class AcquirerControllerTest {
    @InjectMocks
    lateinit var acquirerController: AcquirerController

    @Mock
    lateinit var acquirerService: AcquirerService

    @Test
    fun getAcquirer() {
        var listAcquirer: List<Acquirer> = listOf(
                Acquirer(1, "BCA", 1),
                Acquirer(2, "mandiri", 0)
        )
        doReturn(listAcquirer).`when`(acquirerService).getListAcquirer()

        val result = acquirerController.getAcquirer()
        assertEquals(result, listAcquirer)
    }

    @Test
    fun getAcquirerEmpty() {
        doReturn(null).`when`(acquirerService).getListAcquirer()
        var result = acquirerController.getAcquirer()
        assertEquals(result, null)
    }

    @Test
    fun postAcquirer() {
        var postAcquirer = Acquirer(0, "BSP", 0)
        var returnAcquirer = Acquirer(5, "BSP", 0)
        doReturn(returnAcquirer).`when`(acquirerService).insertAcquirer(postAcquirer)

        var result = acquirerController.postAcquirer(postAcquirer)
        assertEquals(result, postAcquirer)
    }


}
