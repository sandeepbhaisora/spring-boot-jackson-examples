package com.example.jackson.jacksonexample.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

    private static RestTemplate restTemplate;
    static {
        restTemplate = new RestTemplate();
    }

    public JsonNode getJsonNode(){
        return restTemplate.getForObject("https://run.mocky.io/v3/235c92e8-6db5-47ca-ab05-686a402a11da",JsonNode.class);
    }

    public ArrayNode getArrayNode() {
        return restTemplate.getForObject("https://run.mocky.io/v3/f23ba6e8-42c0-4387-a987-2a7bc9d9a075", ArrayNode.class);
    }
}
