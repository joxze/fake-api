package com.josep.fakeapi.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("manage")
class ManageController {

    @GetMapping("")
    fun index(model: Model): String {
        println("test")
        model["title"] = "Htest123"
        return "manage/index"
    }
}