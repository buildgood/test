package com.test.incident.service;

import java.util.List;

import com.test.incident.entity.Incident;

public interface IncidentService {

    void createIncident(Incident incident);

    void deleteIncident(Incident incident);

    void modifyIncident (Incident incident);

    List<Incident> list();
}
