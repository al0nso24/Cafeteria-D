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
public class Pedido_Listo implements Command{  //Comandos concretos.
    private Pedido pedido;

    public Pedido_Listo(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public void execute(){
        pedido.pedidoListo();
    }
}
