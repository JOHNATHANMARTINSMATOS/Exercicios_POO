/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author jonat
 */
public class Poupanca {
    
    //Atributos
    private String nomeDoCliente = " ";
    private int numeroDaConta = 0;
    private int agencia = 0;
    private float saldo = 0;
    
    //Metodos acessores

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //Construtor da classe
    public Poupanca(String nomeDoCliente, int numeroDaConta, int agencia, float saldo)throws Exception{
        
        this.nomeDoCliente = nomeDoCliente;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        if(saldo < 1000)throw new Exception("Deposito para abertura de conta é R$ 1000,00");
        this.saldo = saldo;
    }
    //Metodos
    
    //Metodo sacar 
    public float sacarDinheiro (float sacar){
      return  saldo -= sacar ;
    }
    
    //Metodo depositar
    public float depositarDinheiro(float deposito){
       return saldo+= deposito;
    }
}
