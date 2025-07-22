/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Cafeteria;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alonso
 */
public class Gestion_Cafeteria {
    private static Gestion_Cafeteria uniqueInstace;
    private ArrayList<Cafeteria> lista_Cafe = new ArrayList<>();  //ArrayList para listar los pedidos.

    public Gestion_Cafeteria() {
    }
    
    //Patrón Singleton:
    public static Gestion_Cafeteria getInstancia(){
        if(uniqueInstace==null){
            uniqueInstace = new Gestion_Cafeteria();
        }
        return uniqueInstace;
    }
    
    public double obtener_Precio(String tipo_cafe){ //Precios predefinidos para cada tipo de café.
        switch (tipo_cafe) {
            case "Americano":
                return 7.00;
            case "Esspreso":
                return 5.50;
            case "Mocha":
                return 10.00;
            case "Cappuccino":
                return 8.50;
            case "Flat White":
                return 12.50;
            case "Frapuccino":
                return 12.00;
            case "Café con leche":
                return 11.00;
            case "Café Irlandés":
                return 24.20;
            case "Cold Brew":
                return 15.00;
            case "Affogato":
                return 13.50;
                default: return 0;
        }
    }
    
    public void agregar_Pedido(Cafeteria cafe){  //Agrega pedidos a la tabla.
        lista_Cafe.add(cafe);
    }
    
    public void mostrar_Pedidos(JTable tablita){  //Muestra los datos en la tabla.
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Número de pedido");
        modelo.addColumn("Café");
        modelo.addColumn("Precio total");
        for (Cafeteria cafe : lista_Cafe) {
            Object[] fila = {cafe.getNum_pedido(), cafe.getTipo_cafe(), cafe.getPrecio()};
            modelo.addRow(fila);
        }
        tablita.setModel(modelo);
    }
    
    public double dinero_Recaudado(){  //Este método calcula la suma de todo el dinero recaudado en ventas.
        double suma=0;
        for (Cafeteria cafe : lista_Cafe) {
            suma += cafe.getPrecio();
        }
        return suma;
    }
}
