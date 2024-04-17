package proyecto;

import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amoli
 */

// Inicializamos las variables de la clase
public class jugadores implements Serializable {
    private String nombre ;
    private int casilla, vuelta, dinero, viviendas, libre_carcel,id;
    private boolean carcel ,ganador;
    private static final long serialVersionUID=1L;

    
//Creamos los Setters y los Getters de cada variables ya que la variables son privadas
    public boolean isGanador() {
        return ganador;
    }
//Le damos unos valores predeterminados a las variables
    public jugadores (){
        nombre=" ";
        casilla=1;
        vuelta=0;
        dinero=100;
        carcel=false;
        ganador=false;
        viviendas=0;
        libre_carcel=0;
        id=0;
                
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLibre_carcel() {
        return libre_carcel;
    }

    public void setLibre_carcel(int libre_carcel) {
        this.libre_carcel = libre_carcel;
    }
    

    public int getViviendas() {
        return viviendas;
    }

    public void setViviendas(int viviendas) {
        this.viviendas = viviendas;
    }
   
        
    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public String getNombre() {
        return nombre;}

    public void setCasilla(int casilla) {
        this.casilla = casilla;
    }

    public int getCasilla() {
        return casilla;
    }

    public int getVuelta() {
        return vuelta;
    }

    public void setVuelta(int vuelta) {
        this.vuelta = vuelta;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }
    public boolean getCarcel() {
        return carcel;
    }
    
    
   

    
    
}
