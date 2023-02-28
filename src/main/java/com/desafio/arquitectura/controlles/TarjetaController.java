package com.desafio.arquitectura.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.desafio.arquitectura.models.TarjetaRequest;
import com.desafio.arquitectura.models.TarjetaResponse;
import com.desafio.arquitectura.servicios.TarjetaService;





@RestController
@RequestMapping("/tarjeta")
public class TarjetaController {
	
	@Autowired
    private TarjetaService tarjetaService;

    @PostMapping("/crear")
    public ResponseEntity<TarjetaResponse> crearTarjeta(@RequestBody TarjetaRequest request) {
        TarjetaResponse response = tarjetaService.crearTarjeta(request);
        if ("01".equals(response.getCodigoRespuesta())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
