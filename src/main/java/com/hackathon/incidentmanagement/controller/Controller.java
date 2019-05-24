package com.hackathon.incidentmanagement.controller;

import com.hackathon.incidentmanagement.processor.ServiceNowProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Controller {

    @Autowired
    private ServiceNowProcessor processor;

    @GetMapping("/incident/get/{incidentNumber}")
    public String getIncidentDetails(@PathVariable("incidentNumber") String incidentNumber  ){
        return processor.incidentRequest(incidentNumber);
    }

    @PostMapping("/incident/create")
    public String createIncident() throws IOException {
        return processor.createIncident();
    }
}
