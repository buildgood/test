package com.test.incident.service.impl;



import java.util.List;

import java.util.List;

import com.test.incident.exception.IncidentAlreadyExistsException;
import com.test.incident.exception.NoSuchIncidentExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.incident.dao.IncidentRepository;
import com.test.incident.entity.Incident;
import com.test.incident.service.IncidentService;

public class IncidentServiceImpl implements IncidentService {

    @Autowired
    private IncidentRepository incidentRepository;
    @Override
    public void createIncident(Incident incident) {
        boolean isExist = incidentRepository.findById(incident);
        if (!isExist) {
            incidentRepository.create(incident);
        } else {
            throw new IncidentAlreadyExistsException("Incident already exists.");
        }
    }
    @Override
    public void deleteIncident(Incident incident) {
        boolean isExist = incidentRepository.findById(incident);
        if (isExist) {
            incidentRepository.delete(incident);
        } else {
            throw new NoSuchIncidentExistsException("No such incident exists.");
        }
    }
    @Override
    public void modifyIncident (Incident incident) {
        incidentRepository.modify(incident);
    }
    @Override
    public List<Incident> list() {
        return incidentRepository.listAll();
    }
}
