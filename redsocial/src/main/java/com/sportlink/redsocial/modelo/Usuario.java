package com.sportlink.redsocial.modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Usuario {
    String nombre;
    String password;
    @Id String login; 

    @OneToMany(mappedBy = "remitente")
    List<SolicitudAmistad> solicitudesEnviadas;

    @OneToMany(mappedBy = "destinatario")
    List<SolicitudAmistad> solicitudesRecibidas;
}
