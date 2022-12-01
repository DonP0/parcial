package com.parcial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.parcial.entity.Usuario;
import com.parcial.repository.UsuarioRepository;
import com.parcial.service.MyUsuarioDetails;

public class MyUsuarioDetailsImpl implements UserDetailsService {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository.getUsuarioByUsername(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("No existe el usuario con username: " + username);
        }
        return new MyUsuarioDetails(usuario, repository);
    }
}