package com.desafio.arquitectura.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tarjetasact")
public class Tarjeta {
	
	public enum EstadoTarjeta {
        CREADA,
        ENROLADA,
        BLOQUEADA,
        CANCELADA
    }
	
	public enum TipoTarjeta {
        CREDITO,
        DEBITO
    }
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
    private String pan;
    
    @Column(nullable = false)
    private String titular;
    
    @Column(nullable = false)
    private String cedula;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoTarjeta tipo;
    
    @Column(nullable = false)
    private String telefono;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoTarjeta estado = EstadoTarjeta.CREADA;
    
    @Column(nullable = false)
    private int numValidacion;

	public Tarjeta(Long id, String pan, String titular, String cedula, TipoTarjeta tipo, String telefono,
			EstadoTarjeta estado, int numValidacion) {
		super();
		this.id = id;
		this.pan = pan;
		this.titular = titular;
		this.cedula = cedula;
		this.tipo = tipo;
		this.telefono = telefono;
		this.estado = estado;
		this.numValidacion = numValidacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public int getNumValidacion() {
		return numValidacion;
	}

	public void setNumValidacion(int numValidacion) {
		this.numValidacion = numValidacion;
	}

	
	

	
    
    

}