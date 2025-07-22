/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Patron_Command;

import Modelo.Patron_Command.Command;

/**
 *
 * @author Alonso
 */
public class Gestor_Command {  //Invocador.
    private Command comando;

    public void setComando(Command comando) {
        this.comando = comando;
    }
    
    public void presionar_Boton(){
        comando.execute();
    }
}
