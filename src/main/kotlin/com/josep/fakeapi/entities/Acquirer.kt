package com.josep.fakeapi.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Acquirer(@Id
                     @GeneratedValue(strategy = GenerationType.IDENTITY)
                     val id: Int=0,
               val name: String="",
               var migsStatus: Int=1)
