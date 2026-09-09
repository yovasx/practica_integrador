package com.unifranz.proyectointegrador.infrastructure.web.controller;

import com.unifranz.proyectointegrador.application.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    // Este es el punto de acceso para eliminar lógicamente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEvento(@PathVariable Long id) {
        eventoService.eliminarLogico(id);
        return ResponseEntity.noContent().build(); // Devuelve un estado 204 (Éxito)
    }
}