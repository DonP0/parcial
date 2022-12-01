package com.parcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parcial.entity.Mascotas;


public class MascotasController {
	@Autowired
    private listarmascotas listarmascotas;

    @GetMapping("/mascotas")
    public String mascotas (Model model) {
    	List<Mascota> ListadoMascota = listarmascotas.listarTodos();
    	model.addAttribute("titulo","Lista de Mascotas");
    	model.addAttribute("Mascotas",ListadoMascotas);
        return "mascotas.html";
    }

   
    

}
