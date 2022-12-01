package com.parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parcial.entity.Usuario;
import com.parcial.repository.UsuarioRepository;

@Controller

public class HomeController {
	
	    @Autowired
	    private UsuarioRepository usuarioRepository;

	    @GetMapping("/")
	    public String index() {
	        return "index.html";
	    }

	    @GetMapping("/login.html")
	    public String loginForm(Model model) {
	        model.addAttribute("usuario", new Usuario());
	        return "login.html";
	    }

	    @GetMapping("/register.html")
	    public String registerForm(Model model) {
	        model.addAttribute("usuario", new Usuario());
	        return "register.html";
	    }

	    @PostMapping("/register.html")
	    public String registerProcess(@ModelAttribute("usuario") Usuario usuario) {
	        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	        usuario.setPassword(encoder.encode(usuario.getPassword()));
	        usuarioRepository.save(usuario);
	        return "redirect:/login.html";
	    }
}
