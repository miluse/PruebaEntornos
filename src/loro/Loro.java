/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loro;

/**
 *
 * @author Manolo
 */
public class Loro {
    private String nombre;
    private String color;
    private int edad;
   
    
    public Loro(String nombre, String color, int edad){
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        
    }
    
    public String getNombre(){
        return nombre;
}
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String nuevoColor){
        this.color = nuevoColor;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int nuevaEdad){
        this.edad = nuevaEdad;
    }
}
