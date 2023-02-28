package com.desafio.arquitectura.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.arquitectura.models.Tarjeta;
import com.desafio.arquitectura.models.TarjetaRequest;
import com.desafio.arquitectura.models.TarjetaResponse;
import com.desafio.arquitectura.repositories.TarjetaRepository;



@Service
public class TarjetaService {
	

    @Autowired
    private TarjetaRepository tarjetaRepository;

    public TarjetaResponse crearTarjeta(TarjetaRequest request) {
        // Generar número de validación aleatorio
        int numeroValidacion = (int) (Math.random() * 100) + 1;

        // Enmascarar PAN
        String panEnmascarado = enmascararPAN(request.getPan());

        // Crear objeto Tarjeta
        Tarjeta tarjeta = new Tarjeta(request.getId(),request.getPan(), request.getTitular(), request.getCedula(), request.getTipo(), request.getTelefono(), request.getEstado(), request.getNumeroValidacion());

        // Guardar tarjeta en la base de datos
        tarjeta = tarjetaRepository.save(tarjeta);

        // Preparar respuesta
        TarjetaResponse response = new TarjetaResponse("", "", numeroValidacion, "");
        response.setNumValidacion(numeroValidacion);
        response.setPanEnmascarado(panEnmascarado);
        response.setCodigoRespuesta("00");
        response.setMensaje("Éxito");

        return response;
    }

    // Método para enmascarar los dígitos del medio del PAN
    private String enmascararPAN(String pan) {
        String primeraParte = pan.substring(0, 6);
        String ultimaParte = pan.substring(pan.length() - 4);
        String medioEnmascarado = "****";
        return primeraParte + medioEnmascarado + ultimaParte;
    }
    
    
    //ENROLAR Y CONSULTAR TARJETA
    
   
	    
}
