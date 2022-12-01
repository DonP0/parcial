package com.parcial.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.parcial.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
    @Query("SELECT usuario FROM Usuario usuario WHERE usuario.username = :username")
    Usuario getUsuarioByUsername(@Param("username") String username);
}
