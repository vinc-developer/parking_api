package com.formation.parking.controllers;

import com.formation.parking.models.Parking;
import com.formation.parking.services.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @CrossOrigin("http://localhost:4200")  /*ON PEU AJOUTER UNE * POUR AUTORISER TOUT LES SITES */
    @GetMapping("/api/parkings")
    public List<Parking> getListParkings(){
        return parkingService.getListParkings();
    }
}
