package com.test.incident.controller;

import java.util.List;

import com.test.incident.entity.Incident;
import com.test.incident.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/incident")
public class IncidentController {
    
    private IncidentService incidentService;

    @PostMapping("create")
    public ResponseEntity<Incident> create(@RequestBody Incident incident) {
        incidentService.createIncident(incident);
        return new ResponseEntity<>(incident, HttpStatus.CREATED);
    }

    @PostMapping("delete")
    public ResponseEntity<Incident> delete(@RequestBody Incident incident) {
        incidentService.deleteIncident(incident);
        return new ResponseEntity<>(incident, HttpStatus.OK);
    }

    @PostMapping("modify")
    public ResponseEntity<Incident> modify(@RequestBody Incident incident) {
        incidentService.modifyIncident(incident);
        return new ResponseEntity<>(incident, HttpStatus.OK);
    }

    @GetMapping("list")
    public List<Incident> list() {
        return incidentService.list();
    }
}
