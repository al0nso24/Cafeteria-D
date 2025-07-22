/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Patron_Decorator;

import Modelo.Patron_Decorator.Cafe;

/**
 *
 * @author Alonso
 */
public class Cafe_Base implements Cafe{
    private double precio;

    public Cafe_Base(double precio) {
        this.precio = precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
}
