package Hojas;

import Interfaces.Componente;

public class DiscoDuro implements Componente{
    
    String nombre;
    float precioneto;
    
    public DiscoDuro(String nombre, float precio){
        
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
        return "DiscoDuro{" + "nombre=" + nombre + ", precioneto=" + precioneto + '}';
    }
    
    

    
}
