package com.formation.parking.models;

public class Parking {

    private String nom;
    private int nbPlacesDispo;
    private int nbPlacesTotal;
    private String statut;
    private String heureMaj;

    public Parking(String nom, int nbPlacesDispo, int nbPlacesTotal, String statut, String heureMaj) {
        this.nom = nom;
        this.nbPlacesDispo = nbPlacesDispo;
        this.nbPlacesTotal = nbPlacesTotal;
        this.statut = statut;
        this.heureMaj = heureMaj;
    }

    public Parking() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPlacesDispo() {
        return nbPlacesDispo;
    }

    public void setNbPlacesDispo(int nbPlacesDispo) {
        this.nbPlacesDispo = nbPlacesDispo;
    }

    public int getNbPlacesTotal() {
        return nbPlacesTotal;
    }

    public void setNbPlacesTotal(int nbPlacesTotal) {
        this.nbPlacesTotal = nbPlacesTotal;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getHeureMaj() {
        return heureMaj;
    }

    public void setHeureMaj(String heureMaj) {
        this.heureMaj = heureMaj;
    }
}