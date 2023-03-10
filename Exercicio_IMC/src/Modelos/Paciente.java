/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author jonat
 */
public class Paciente {
    //Atributos
    
    private String nomeCompleto = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";
    
    // Criando contrutor da classe atravez de parametros
    
    public Paciente(String nomeCompleto, int peso, float altura, String sexo)throws Exception{
        
        this.nomeCompleto = nomeCompleto;
        
        if(peso <=0) throw new Exception("Peso nao pode ser <=0");
        this.peso = peso;
        
        if(altura <=0) throw new Exception("Altura não pode ser <=0");
        this.altura= altura;
        
        this.sexo = sexo;
        
    }
    
    // Metodos acessores

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getPeso() throws Exception {
        if (peso <=0) throw new Exception("Peso não pode ser <=0");
        return peso;
    }

    public void setPeso(int peso)throws Exception {
        if(peso <=0) throw new Exception("Peso não pode ser <=0");
        this.peso = peso;
    }

    public float getAltura()throws Exception {
        if(altura <= 0) throw new Exception("Altura não pode ser <= 0");
        return altura;
    }

    public void setAltura(float altura)throws Exception {
        if(altura <= 0) throw new Exception("Altura não pode ser <= 0");
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    // Metodos
    
    public float calcularImc(){
        return (peso/(altura * altura));
    }
    public String indicarFaixaDePeso(){
        float imc = calcularImc();
        
        if (imc < 20) return "Abaixo do peso ideal";
        if (imc <= 25) return "Peso Normal";
        if(imc <= 30) return "Excesso de Peso";
        if(imc <= 35) return "Obesidade";
        return "Obesidade Morbida";
    }
    public float calcularPesoIdeal(){
        if(sexo.equalsIgnoreCase("FEMININO"))
            return (float) (62.1 * altura - 44.7);
           return (float)(72.7 * altura - 58);
        
         
    }
    
}
