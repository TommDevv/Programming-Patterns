package Hojas;

import Interfaces.Componente;

public class Procesador implements Componente{
    
    String nombre;
    float precioneto;
    
    public Procesador(String nombre, float precio){
        
        this.nombre=nombre;
        this.precioneto=precio;
    }

       
    @Override
    public String getnombre(){
        return nombre;
    }
    
    @Override
    public float getprecioN(){
        return precioneto;
    }
    
   
    @Override
    public void añadir(Componente con){}
    public void borrar(Componente con){}

    @Override
    public String toString() {
        return "Procesador{" + "nombre=" + nombre + ", precioneto=" + precioneto + '}';
    }


    
}