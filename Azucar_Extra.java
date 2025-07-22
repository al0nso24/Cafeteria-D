/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Patron_Decorator;

import Modelo.Patron_Decorator.Cafe_Decorator;
import Modelo.Patron_Decorator.Cafe;

/**
 *
 * @author Alonso
 */
public class Azucar_Extra extends Cafe_Decorator{
    
    public Azucar_Extra(Cafe decoratedCafe) {
        super(decoratedCafe);
    }
    
    public double getPrecio(){
        return decoratedCafe.getPrecio()+0.50;  //En este caso se le suma 0.50 al precio del café.
    }
    
}
