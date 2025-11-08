package com.sportlink.redsocial.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportlink.redsocial.modelo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String>{

}
