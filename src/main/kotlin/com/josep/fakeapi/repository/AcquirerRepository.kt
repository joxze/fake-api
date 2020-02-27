package com.josep.fakeapi.repository

import com.josep.fakeapi.entities.Acquirer
import org.springframework.data.jpa.repository.JpaRepository

interface AcquirerRepository : JpaRepository<Acquirer, Int>
