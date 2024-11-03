/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopoly_mundo;

/**
 *
 * @author Pablo
 */
public class Salida extends Casilla {
    // Sublase salida con un valor que se podrá añadir al balance del jugador cada vez que pase por la salida
    int cantidad;
    
    public Salida(String nombre) {
        super(nombre);
        this.cantidad = 20;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void getSalario(int salario) {
        this.cantidad = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
