/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Alonso
 */
public class Cafeteria {
    int num_pedido;
    String tipo_cafe;
    double precio;

    public Cafeteria(String tipo_cafe) {  //Constructor para agregar el tipo de café que queremos.
        this.tipo_cafe = tipo_cafe;
    }

    public int getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(int num_pedido) {
        this.num_pedido = num_pedido;
    }

    public String getTipo_cafe() {
        return tipo_cafe;
    }

    public void setTipo_cafe(String tipo_cafe) {
        this.tipo_cafe = tipo_cafe;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
