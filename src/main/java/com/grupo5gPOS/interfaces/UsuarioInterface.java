 package com.grupo5gPOS.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo5gPOS.models.Usuario;

public interface UsuarioInterface extends JpaRepository<Usuario, Integer> {

}
