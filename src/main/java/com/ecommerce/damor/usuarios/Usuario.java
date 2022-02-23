package com.ecommerce.damor.usuarios;

public class Usuario {
private int id;
 private String nombre;
 private String correo;
 private String telefono;
 private String contraseña;
 private static int total=0;



public Usuario(String nombre, String correo, String telefono, String contraseña) {
	super();
	total++;
	this.id = total;
	this.nombre = nombre;
	this.correo = correo;
	this.telefono = telefono;
	this.contraseña = contraseña;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getContraseña() {
	return contraseña;
}
public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}

@Override
public String toString() {
	return "Usuario [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
			+ ", contraseña=" + contraseña + "]";
}

 public Usuario() {
	 super();
	 
 }
 
}
