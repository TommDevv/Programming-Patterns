package Hojas;

import Interfaces.Componente;

public class Memoria implements Componente{
    
    String nombre;
    float precioneto;
    
    public Memoria(String nombre, float precio){
        
        this.nombre=nombre;
        this.precioneto=precio;
    }

   
    
    @Override
    public String getnombre(){
        
        //return "Memoria";
        return nombre;
    }
    
    @Override
    public float getprecioN(){
        return precioneto;
    }
    
    
    public void añadir(Componente con){}
    public void borrar(Componente con){}

    @Override
    public String toString() {
        return "Memoria{" + "nombre=" + nombre + ", precioneto=" + precioneto + '}';
    }
    
    
}