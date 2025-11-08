package com.sportlink.redsocial.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class SolicitudAmistad {
    LocalDate fechaSolicitud;
    @Id @GeneratedValue Long id;
    Boolean aceptado;
    LocalDate fechaRespuesta;
    
    @ManyToOne
    Usuario remitente;

    @ManyToOne
    Usuario destinatario;
}
