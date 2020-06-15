package com.shasha.poc.springintg.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.shasha.poc.springintg.dto.Borrower;
import com.shasha.poc.springintg.dto.Response;
import com.shasha.poc.springintg.service.AppService;
import com.shasha.poc.springintg.gateway.PostGateway;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AppServiceImpl implements AppService {

    @Autowired
    PostGateway postGateway;

    @Override
    public Response postMessage(Borrower borrower) {
    	Response.Builder responseBuilder = Response.builder().timestamp(LocalDateTime.now().toString());
    	
        try {
            XmlMapper xmlMapper = new XmlMapper();
            String response = postGateway.httpPost(xmlMapper.writeValueAsString(borrower));
            responseBuilder.status("SUCCESS").desc(response);
        } catch (JsonProcessingException e) {
            log.error("Exception while converting object={}", borrower, e);
            responseBuilder.status("ERROR").desc(e.getMessage());
        }
        return responseBuilder.build();
    }
}
