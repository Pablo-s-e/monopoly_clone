/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopoly_mundo;

/**
 *
 * @author Pablo
 */
public class Propiedad extends Casilla {
    // Subclase de propiedad
    // Atributos
    int precio;
    int alquiler;
    Jugador propietario;

    // Constructor
    public Propiedad(String nombre, int precio) {
        super(nombre);
        this.precio = precio;
        this.alquiler = precio/2;
        this.propietario = propietario;
    }

    // Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }
    
    // toString
    public String toString() {
        return this.nombre;
    }
    
    
}
