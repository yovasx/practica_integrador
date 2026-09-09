package com.unifranz.proyectointegrador.application.service.impl;

import com.unifranz.proyectointegrador.application.service.EventoService;
import com.unifranz.proyectointegrador.domain.Evento;
import com.unifranz.proyectointegrador.domain.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public void eliminarLogico(Long id) {
        Evento evento = eventoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento no encontrado"));
        
        evento.setEstado(false);
        eventoRepository.save(evento);
    }
}