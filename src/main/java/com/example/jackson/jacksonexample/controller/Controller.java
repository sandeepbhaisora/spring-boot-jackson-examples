package com.example.jackson.jacksonexample.controller;

import com.example.jackson.jacksonexample.service.Service;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

    @Autowired
    Service service;

    @ApiOperation(value = "gets json node ")
    @GetMapping(value = "/getJsonNode")
    public ResponseEntity<JsonNode> fetchJsonNode(){
        return new ResponseEntity<>(service.getJsonNode(), HttpStatus.OK);
    }

    @ApiOperation(value = "gets array node")
    @GetMapping(value = "/getArrayNode")
    public ResponseEntity<ArrayNode> fetchArrayNode(){
        return new ResponseEntity<>(service.getArrayNode(), HttpStatus.OK);
    }

}
