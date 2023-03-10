/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jonat
 */
// classe
public class Esfera {
    
    //Atributos
    private float raio = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    public float calcularArea(){
        return (float) ((4 * Math.PI)*Math.pow(raio, 2));
    }
    public float calcularVolume(){
        return (float) ((4 * Math.PI * Math.pow(raio, 3)/3));
    }
}
