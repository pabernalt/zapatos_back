package com.salem23.models.entity;

import javax.persistence.*;

@Entity
@Table(name="zapato")
public class Zapatos {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="idzapato")
private Integer idZapato;
@Column(name="precio")
private String precio;
@Column(name="talla")
private String talla;
@ManyToOne
@JoinColumn(name="tipo_zapato")
private TipoZapato tipoZapato;
@ManyToOne
@JoinColumn(name="cedula_usuario")
private Usuarios cedulaUsuario;
@ManyToOne
@JoinColumn(name="id_linea_zapato")
private LineaZapato idLineaZapato;
@ManyToOne
@JoinColumn(name = "color")
private Color idColor;
@ManyToOne
@JoinColumn(name="estado_zapato")
private Estado estadoZapato;
@ManyToOne
@JoinColumn(name="id_marca")
private Marca idMarca;
public Integer getIdZapato() {
	return idZapato;
}
public void setIdZapato(Integer idZapato) {
	this.idZapato = idZapato;
}
public String getPrecio() {
	return precio;
}
public void setPrecio(String precio) {
	this.precio = precio;
}
public String getTalla() {
	return talla;
}
public void setTalla(String talla) {
	this.talla = talla;
}
public TipoZapato getTipoZapato() {
	return tipoZapato;
}
public void setTipoZapato(TipoZapato tipoZapato) {
	this.tipoZapato = tipoZapato;
}
public Usuarios getCedulaUsuario() {
	return cedulaUsuario;
}
public void setCedulaUsuario(Usuarios cedulaUsuario) {
	this.cedulaUsuario = cedulaUsuario;
}
public LineaZapato getIdLineaZapato() {
	return idLineaZapato;
}
public void setIdLineaZapato(LineaZapato idLineaZapato) {
	this.idLineaZapato = idLineaZapato;
}
public Color getIdColor() {
	return idColor;
}
public void setIdColor(Color idColor) {
	this.idColor = idColor;
}
public Estado getEstadoZapato() {
	return estadoZapato;
}
public void setEstadoZapato(Estado estadoZapato) {
	this.estadoZapato = estadoZapato;
}
public Marca getIdMarca() {
	return idMarca;
}
public void setIdMarca(Marca idMarca) {
	this.idMarca = idMarca;
}
}