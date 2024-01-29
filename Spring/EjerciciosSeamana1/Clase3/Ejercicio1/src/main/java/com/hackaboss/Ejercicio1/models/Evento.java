package com.hackaboss.Ejercicio1.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {

    private static int contadorId = 1;

    int id;
    String titulo;
    String descripcion;
    LocalDate fecha;
    LocalTime hora;
    String lugar;
    String ponente;

    public Evento(String titulo, String descripcion, LocalDate fecha, LocalTime hora, String lugar, String ponente) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.ponente = ponente;
    }

    public int getId(){
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPonente() {
        return ponente;
    }

    public void setPonente(String ponente) {
        this.ponente = ponente;
    }
}
