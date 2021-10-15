package com.salem23.models.entity;

import javax.persistence.*;

@Entity
@Table(name="marca")
public class Marca {

@Id
@Column(name="idmarca")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer idMarca;
@Column(name="nombre_marca")
private String nombreMarca;

public Integer getIdMarca() {
	return idMarca;
}
public void setIdMarca(Integer idMarca) {
	this.idMarca = idMarca;
}
public String getNombreMarca() {
	return nombreMarca;
}
public void setNombreMarca(String nombreMarca) {
	this.nombreMarca = nombreMarca;
}
}


