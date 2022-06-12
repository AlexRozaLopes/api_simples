package com.example.api_simples.controller;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
@Log4j2
@ConfigurationProperties(prefix = "exemplo.teste")
@Data
public class EndpointVariaveis {

    @Value("${server.port}")
    private String variavelDoConfigServer;

    private String variavelDoApplication;

    @GetMapping
    private String simpleGet() {
        log.info("Api chamada com sucesso!");
        return this.variavelDoConfigServer + this.variavelDoApplication;
    }

}
