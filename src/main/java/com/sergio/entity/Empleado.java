package com.sergio.entity;


//{nombre: 'pepe2', posicion:'pos', oficina:'Argentina', edad:20, start: date.getFullYear(), salario: 20000},
public class Empleado {
	private long id;
	private String nombre;
	private String origen;
	private String oficina;
	private int edad;
	private String fInicio;
	private int salario;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getOficina() {
		return oficina;
	}
	public void setOficina(String oficina) {
		this.oficina = oficina;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getfInicio() {
		return fInicio;
	}
	public void setfInicio(String fInicio) {
		this.fInicio = fInicio;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
