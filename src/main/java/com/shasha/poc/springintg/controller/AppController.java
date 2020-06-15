package com.shasha.poc.springintg.controller;

import com.shasha.poc.springintg.dto.Borrower;
import com.shasha.poc.springintg.dto.Response;
import com.shasha.poc.springintg.service.AppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("api/v1")
@Slf4j
public class AppController {

    @Autowired
    AppService appService;

    @PostMapping("/borrower")
    public Response borrower(@Valid @RequestBody Borrower borrower) {
        log.debug("received message={} @={}", borrower, LocalDateTime.now());
        return appService.postMessage(borrower);
    }

    @PostMapping("/post")
    public String post(@RequestBody String message) {
        log.info("processing message={}", message);
        return "processed "+ message;
    }
}
