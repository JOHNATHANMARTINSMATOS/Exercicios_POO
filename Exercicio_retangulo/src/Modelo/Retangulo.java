/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;

/**
 *
 * @author jonat
 */
public class Retangulo {
    // atributos
    
    private float comprimento = 0;
    private float largura = 0;

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    // Metodo de calcular perimetro de um retangulo
   public float calcularPerimetro(){
       return ((comprimento * 2)+(largura * 2));
   }
   public float calcularArea(){
       return (largura * comprimento);
   }
    
}
