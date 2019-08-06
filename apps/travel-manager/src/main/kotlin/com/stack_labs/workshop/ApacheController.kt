package com.stack_labs.workshop

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Single

@Controller("/apache")
class ApacheController(private val apacheClient: ApacheClient) {

    @Get("/")
    fun home(): Single<String> = apacheClient.home()
}