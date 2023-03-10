/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author jonat
 */
public class Cone {
    //Atributos Privados
    private float raio = 0;
    private float altura = 0;
    
    // metodos acessores

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio)throws Exception /* Metodo lançador de excessão*/{
        // Tratamendo de excessoes
        if(raio<=0)throw new Exception("Raio não pode ser menor ou igual á zero!");
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura)throws Exception{
        
    //Tratamento de excessoes
    
        if(altura<=0)throw new Exception("Altura não pode se menor ou igual á zero!");
        this.altura = altura;
    }
    
    
    //Metodos para resolução do problema
    
    public float calcularGeratriz(){
        return (float)(Math.sqrt(Math.pow(altura, 2)+Math.pow(raio, 2)));
    }
    public float calcularArealateral(){
        return (float)(Math.PI * raio * calcularGeratriz());
    }
    public float calcularAreaTotal(){
       return (float)((Math.PI*raio)*(calcularGeratriz()+raio)) ;
    }
    public float calcularVolume(){
        return(float)(((1.0/3.0)*Math.PI)*(Math.pow(raio, 2)*altura));
    }
}
