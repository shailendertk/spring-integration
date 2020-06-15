package com.shasha.poc.springintg.gateway;

import org.springframework.integration.annotation.Gateway;

public interface PostGateway {

    @Gateway(requestChannel = "requestChannel")
    String httpPost(String message);
}
