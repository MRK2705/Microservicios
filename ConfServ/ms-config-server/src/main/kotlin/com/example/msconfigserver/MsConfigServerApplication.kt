package com.example.msconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
//iniciando aplicacion
class MsConfigServerApplication

fun main(args: Array<String>) {
	runApplication<MsConfigServerApplication>(*args)
}
