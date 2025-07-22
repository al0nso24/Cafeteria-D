/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Patron_Command;

import Modelo.Patron_Command.Pedido;
import Modelo.Patron_Command.Command;

/**
 *
 * @author Alonso
 */
public class Preparar_Pedido implements Command{  //Comandos concretos.
    private Pedido pedido;

    public Preparar_Pedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public void execute(){
        pedido.prepararPedido();
    }
}
