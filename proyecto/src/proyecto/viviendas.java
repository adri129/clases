/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.io.Serializable;

/**
 *
 * @author amoli
 */
public class viviendas {
// Inicializamos las variables de la clase
    private boolean comprada=false,hotel=false;
    private int precio=20;
    

//Creamos los Setters y los Getters de cada variables ya que la variables son privadas
    
    public String getDueño() {
        return dueño;
    }

    public void setHotel(boolean hotel ){
        
        this.hotel=hotel;
    }
    public boolean isHotel() {
        return hotel;
    }
    
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    private String dueño="";

    public void setComprada(boolean comprada) {
        this.comprada = comprada;
    }  
    

    public boolean isComprada() {
        return comprada;
    }
    

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "viviendagh{" + "comprada=" + comprada  + ", precio=" + precio + ", due\u00f1o=" + dueño + '}';
    }
    
    

    
    
    
}
