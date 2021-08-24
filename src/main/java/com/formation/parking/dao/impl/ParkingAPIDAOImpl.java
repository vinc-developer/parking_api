package com.formation.parking.dao.impl;

import com.formation.parking.dao.ParkingAPIDAO;
import com.formation.parking.dao.entity.ReponseParkingAPIEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ParkingAPIDAOImpl implements ParkingAPIDAO {

    private static final String URL = "https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&facet=grp_nom&facet=grp_statut";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ReponseParkingAPIEntity getListeParking() {
        return restTemplate.getForEntity(URL, ReponseParkingAPIEntity.class).getBody();
    }
}
