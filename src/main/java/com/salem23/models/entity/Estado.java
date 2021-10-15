package com.salem23.models.entity;

import javax.persistence.*;

@Entity
@Table(name="estado")
public class Estado {

@Id
@Column(name="id_estado")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer idEstado;
@Column(name="porcentaje")
private String porcentaje;

public Integer getIdEstado() {
	return idEstado;
}
public void setIdEstado(Integer idEstado) {
	this.idEstado = idEstado;
}
public String getPorcentaje() {
	return porcentaje;
}
public void setPorcentaje(String porcentaje) {
	this.porcentaje = porcentaje;
}
}


