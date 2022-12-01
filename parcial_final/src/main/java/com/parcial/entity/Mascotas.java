package com.parcial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mascotas")

public class Mascotas {
	
	 @Id
	    @Column(name = "id", nullable = false)
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(name = "nombre", nullable = false, length = 100)
	    private String nombre;
	    @Column(name = "dueño", nullable = false, unique = true, length = 50)
	    private String dueño;
	    @Column(name = "descripcion", nullable = false, unique = true, length = 300)
	    private String descripcion;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDueño() {
			return dueño;
		}
		public void setDueño(String dueño) {
			this.dueño = dueño;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
	  
	
}
