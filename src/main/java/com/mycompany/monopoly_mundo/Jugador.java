/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopoly_mundo;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Jugador {
    // Clase para crear un jugador
    
    // Atributos
    // ArrayList con todas las propiedades del jugador
    ArrayList<Propiedad> propiedades;
    int indice;
    int posicion;
    double dinero;
    boolean encarcelado;
    
    // Constructor del jugador con los valores predeterminados
    public Jugador(int indice) {
        this.indice = indice;
        this.propiedades = new ArrayList<Propiedad>();
        this.posicion = 0;
        this.dinero = 100;
        this.encarcelado = false;
    }
    
    // Método para ingresar dinero
    public void anadirDinero(double ingreso) {
        this.dinero += ingreso;
    }
    
    // Método para pagar y cambiar el balance del jugador
    // Si el jugador tiene suficiente dinero, devuelve true, si no, devuelve false
    // Se utilizará el valor devuelto para determinar si se sigue la partida o no
    public boolean pagar(Jugador receptor, double pago) {
        if (dinero >= pago) {
            this.dinero -= pago;
            receptor.anadirDinero(pago);
            return true;
        } else {
            return false;
        }
    }
    
    // Método para pagar a la banca, si añadirle dinero a otro jugador
    // Se utilizará el valor devuelto para determinar si se sigue la partida o no
    public boolean pagarBanca(double pago) {
        if (dinero >= pago) {
            this.dinero -= pago;
            return true;
        } else {
            return false;
        }
    }

    // Getters y setters
    public int getPosicion() {
        return posicion;
    }

    public void moverPosicion(int posicion) {
        this.posicion += posicion;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public boolean isEncarcelado() {
        return encarcelado;
    }

    public void setEncarcelado(boolean encarcelado) {
        this.encarcelado = encarcelado;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void anadirPropiedad(Propiedad propiedad) {
        this.propiedades.add(propiedad);
    }

}
