/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopoly_mundo;

/**
 *
 * @author Pablo
 */
public class Carcel extends Casilla {
    // Sublase cárcel que hará que el jugador pierda 1 turno cada vez que caiga en la casilla
    
    // Constructor
    public Carcel(String nombre) {
        super(nombre);
    }

    // Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
