/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author jonat
 */
// Classe
public class Cilindro {
    
 // Atributos privados
    
    private float raio = 0;
    private float altura = 0;
    
//Metodos acessores dos atributos privados
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception{
        // Tratamento de excessões
        
        if (raio <=0)throw new Exception("Raio não pode ser menor ou igual á zero!");
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura)throws Exception{
        //Tratamento de excessões
        
        if(altura <=0)throw new Exception("Altura não pode ser menor ou igual á zero!");
        this.altura = altura;
    }
    
    //Metodos para resolução do problema
    
    public float calcularAreaLateral(){
        return (float) ( 2.0 * Math.PI * (raio * altura));
    }
    public float calcularAreaTotal(){
        return (float)(2.0 * Math.PI*raio*(altura + raio));
    }
    public float calcularVolume(){
        return (float)(Math.PI*raio*raio*altura);
    }
}
