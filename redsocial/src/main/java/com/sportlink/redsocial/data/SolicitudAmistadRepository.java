package com.sportlink.redsocial.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportlink.redsocial.modelo.SolicitudAmistad;

@Repository
public interface SolicitudAmistadRepository extends JpaRepository<SolicitudAmistad,Long>{

}
