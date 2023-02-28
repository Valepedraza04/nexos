package com.desafio.arquitectura.models;

import com.desafio.arquitectura.models.Tarjeta.EstadoTarjeta;
import com.desafio.arquitectura.models.Tarjeta.TipoTarjeta;

public class TarjetaRequest {
	
	private Long id;
	private String pan;
    private String titular;
    private String cedula;
    private TipoTarjeta tipo;
    private String telefono;
    private EstadoTarjeta estado;
    private int numeroValidacion;
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public TipoTarjeta getTipo() {
		return tipo;
	}
	public void setTipo(TipoTarjeta tipo) {
		this.tipo = tipo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public EstadoTarjeta getEstado() {
		return estado;
	}
	public void setEstado(EstadoTarjeta estado) {
		this.estado = estado;
	}
	public int getNumeroValidacion() {
		return numeroValidacion;
	}
	public void setNumeroValidacion(int numeroValidacion) {
		this.numeroValidacion = numeroValidacion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
    
    
	    

}
