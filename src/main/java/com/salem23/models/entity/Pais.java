package com.salem23.models.entity;

import javax.persistence.*;

@Entity
@Table(name="pais")
public class Pais {

@Id
@Column(name="idpais")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer idPais;
@Column(name="nombre_pais")
private String nombrePais;

public Integer getIdPais() {
	return idPais;
}
public void setIdPais(Integer idPais) {
	this.idPais = idPais;
}
public String getNombrePais() {
	return nombrePais;
}
public void setNombrePais(String nombrePais) {
	this.nombrePais = nombrePais;
}
}


