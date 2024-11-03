/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopoly_mundo;

/**
 *
 * @author Pablo
 */
public class Premio extends Casilla {
    // Sublase premio con un valor que se podrá añadir al balance del jugador
    double cantidad;

    // Constructor
    public Premio(String nombre) {
        super(nombre);
        this.cantidad = 20;
    }

    // Getters y Setters
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
