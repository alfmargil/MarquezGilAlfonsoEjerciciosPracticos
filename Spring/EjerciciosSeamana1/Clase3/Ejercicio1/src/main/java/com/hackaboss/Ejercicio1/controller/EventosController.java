package com.hackaboss.Ejercicio1.controller;

import com.hackaboss.Ejercicio1.models.Evento;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping()
public class EventosController {

    private final List<Evento> eventos = new ArrayList<>();

    @GetMapping
    public List<Evento> obtenerEventos() {
        return eventos;
    }

    @GetMapping("evento/{id}")
    public Evento buscarEventoId(@PathVariable int id) {
        return eventos.stream()
                .filter(evento -> evento.getId() == id)
                .findFirst()
                .get();
    }

    @PostMapping("/evento")
    public Evento agregarEvento(@RequestBody Evento nuevoEvento) {
        Evento eventoConId = new Evento(
                nuevoEvento.getTitulo(),
                nuevoEvento.getDescripcion(),
                nuevoEvento.getFecha(),
                nuevoEvento.getHora(),
                nuevoEvento.getLugar(),
                nuevoEvento.getPonente()
        );

        eventos.add(eventoConId);

        return eventoConId;
    }

}
