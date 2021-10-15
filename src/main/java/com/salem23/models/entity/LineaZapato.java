package com.salem23.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="linea_zapato")
public class LineaZapato {

@Id
@Column(name="id_linea")
private Integer idLinea;
@Column(name="nombre_linea")
private String nombreLinea;

public Integer getIdLinea() {
	return idLinea;
}
public void setIdLinea(Integer idLinea) {
	this.idLinea = idLinea;
}
public String getNombreLinea() {
	return nombreLinea;
}
public void setNombreLinea(String nombreLinea) {
	this.nombreLinea = nombreLinea;
}
}


