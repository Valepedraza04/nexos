package com.desafio.arquitectura.models;


public class TarjetaResponse {
	
	private String codigoRespuesta;
    private String mensaje;
    private int numValidacion;
    private String panEnmascarado;
    
	public TarjetaResponse(String codigoRespuesta, String mensaje, int numValidacion, String panEnmascarado) {
		super();
		this.codigoRespuesta = codigoRespuesta;
		this.mensaje = mensaje;
		this.numValidacion = numValidacion;
		this.panEnmascarado = panEnmascarado;
	}

	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getNumValidacion() {
		return numValidacion;
	}

	public void setNumValidacion(int numValidacion) {
		this.numValidacion = numValidacion;
	}

	public String getPanEnmascarado() {
		return panEnmascarado;
	}

	public void setPanEnmascarado(String panEnmascarado) {
		this.panEnmascarado = panEnmascarado;
	}
	
	
    
    


}
