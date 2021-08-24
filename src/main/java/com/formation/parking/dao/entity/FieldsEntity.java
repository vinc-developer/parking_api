package com.formation.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {

    @JsonProperty(value = "idobj")
    private String idObj;

    @JsonProperty(value = "grp_nom")
    private String grpNom;

    @JsonProperty(value = "grp_exploitation")
    private int grpExploitation;

    @JsonProperty(value = "grp_disponible")
    private int grpDisponibilite;

    @JsonProperty(value = "grp_statut")
    private String grpStatus;

    @JsonProperty(value = "grp_horodatage")
    private String grpHorodatage;

    public String getIdObj() {
        return idObj;
    }

    public void setIdObj(String idObj) {
        this.idObj = idObj;
    }

    public String getGrpNom() {
        return grpNom;
    }

    public void setGrpNom(String grpNom) {
        this.grpNom = grpNom;
    }

    public int getGrpExploitation() {
        return grpExploitation;
    }

    public void setGrpExploitation(int grpExploitation) {
        this.grpExploitation = grpExploitation;
    }

    public int getGrpDisponibilite() {
        return grpDisponibilite;
    }

    public void setGrpDisponibilite(int grpDisponibilite) {
        this.grpDisponibilite = grpDisponibilite;
    }

    public String getGrpStatus() {
        return grpStatus;
    }

    public void setGrpStatus(String grpStatus) {
        this.grpStatus = grpStatus;
    }

    public String getGrpHorodatage() {
        return grpHorodatage;
    }

    public void setGrpHorodatage(String grpHorodatage) {
        this.grpHorodatage = grpHorodatage;
    }
}
