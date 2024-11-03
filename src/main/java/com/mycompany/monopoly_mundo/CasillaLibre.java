/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopoly_mundo;

/**
 *
 * @author Pablo
 */
public class CasillaLibre extends Casilla {
    // Sublase casillalibre, no ocurrirá nada cuando el jugador caiga en esta casilla
    
    // Constructor
    public CasillaLibre(String nombre) {
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
