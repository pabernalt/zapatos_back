package com.salem23.models.entity;

import javax.persistence.*;

@Entity
@Table(name="tipo_zapato")
public class TipoZapato {

@Id
@Column(name="id_tipo_zapato")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer idTipo;
@Column(name="tipo_zapato")
private String nombreTipo;

public Integer getIdTipo() {
	return idTipo;
}
public void setIdTipo(Integer idTipo) {
	this.idTipo = idTipo;
}
public String getNombreTipo() {
	return nombreTipo;
}
public void setNombreTipo(String nombreTipo) {
	this.nombreTipo = nombreTipo;
}
}


