package com.salem23.models.entity;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuarios {

@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="cedula")
private Integer cedula;
@Column(name="nombres")
private String nombres;
@Column(name="apellidos")
private String apellidos;
@Column(name="email")
private String email;
@Column(name="username")
private String username;
@Column(name="password")
private String password;
@ManyToOne
@JoinColumn(name = "idPais")
private Pais idPais;

public Integer getCedula() {
	return cedula;
}
public void setCedula(Integer cedula) {
	this.cedula = cedula;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Pais getIdPais() {
	return idPais;
}
public void setIdPais(Pais idPais) {
	this.idPais = idPais;
}
}