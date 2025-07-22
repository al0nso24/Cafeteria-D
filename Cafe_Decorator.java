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
public abstract class Cafe_Decorator implements Cafe{  //Patrón Decorator.
    protected Cafe decoratedCafe;

    public Cafe_Decorator(Cafe decoratedCafe) {
        this.decoratedCafe = decoratedCafe;
    }
    
    public double getPrecio(){
        return decoratedCafe.getPrecio();
    }
}
