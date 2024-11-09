package com.test.incident.dao;

import java.util.*;

import org.springframework.stereotype.Repository;
import com.test.incident.entity.Incident;

@Repository
public class IncidentRepository {

    private Map<Integer, Incident> incidentMap = new HashMap<>();

    public void create(Incident incident) {
        incidentMap.put(incident.getId(), incident);
    }

    public void delete(Incident incident) {
        incidentMap.remove(incident.getId());
    }

    public void modify(Incident incident) {
        incidentMap.put(incident.getId(), incident);
    }

    public boolean findById(Incident incident) {
        return incidentMap.containsKey(incident.getId());
    }

    public List<Incident> listAll() {
        return new ArrayList<>(incidentMap.values());
    }
}
