/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.util.Calendar;

/**
 *
 * @author jonat
 */
public class Eleitor {
    
    // Atributos
    private String nome = " ";
    private int anoDeNascimento = 0;
    
    //Metodos acessores
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeNascimento()throws Exception {
        if(anoDeNascimento <0) throw new Exception("Idade não pode ser menor que zero");
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento)throws Exception{
         if(anoDeNascimento <0) throw new Exception("Idade não pode ser menor que zero");
        this.anoDeNascimento = anoDeNascimento;
    }
    
    // Construtor da classe
    
    public Eleitor(String nome, int anoNascimento )throws Exception{
        
   // instanciando objetos
   
        this.nome = nome;
        if(anoDeNascimento < 0) throw new Exception("Idade não pode ser menor que zero");
        this.anoDeNascimento = anoNascimento;
    }
    //Metodo calcular tipo do eleitor
    
    public String calcularTipoDeEleitor(){
        
        // Metodo para obter ano atual
       Calendar ano = Calendar.getInstance();
        int idade = ano.get(Calendar.YEAR) - anoDeNascimento;
        
        // Condiçoes para qualificar eleitor
        if(idade < 16) return "Não Eleitor!";
        if(idade < 18) return "Eleitor Facultativo!";
        if(idade <= 65) return "Eleitor Obrigatorio!";
        return "Eleitor Facultativo!";
    }
    
}
