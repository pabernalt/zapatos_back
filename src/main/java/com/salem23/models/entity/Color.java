package com.salem23.models.entity;

import javax.persistence.*;

@Entity
@Table(name="color")
public class Color {

@Id
@Column(name="idcolor")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer idColor;
@Column(name="nombre_color")
private String nombreColor;

public Integer getIdColor() {
	return idColor;
}
public void setIdColor(Integer idColor) {
	this.idColor = idColor;
}
public String getNombreColor() {
	return nombreColor;
}
public void setNombreColor(String nombreColor) {
	this.nombreColor = nombreColor;
}
}


