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

    public int getNumeroDaConta()throws Exception {
        if(numeroDaConta <= 0)throw new Exception("Numero da conta não pode ser <= 0") ;
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta)throws Exception {
         if(numeroDaConta <= 0)throw new Exception("Numero da conta não pode ser <= 0") ;
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia()throws Exception {
        if(agencia <= 0) throw new Exception("Agencia não pode ser <=0");
        return agencia;
    }

    public void setAgencia(int agencia)throws Exception {
        if(agencia <= 0) throw new Exception("Agencia não pode ser <=0");
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
        
        if(numeroDaConta <= 0)throw new Exception("Numero da conta não pode ser <= 0") ;
        this.numeroDaConta = numeroDaConta;
        
        if(agencia <= 0) throw new Exception("Agencia não pode ser <=0");
        this.agencia = agencia;
        
        if(saldo < 1000)throw new Exception("Deposito para abertura de conta é R$ 1000,00");
        this.saldo = saldo;
    }
    //Metodos
    
    //Metodo sacar 
    public float sacarDinheiro (float sacar)throws Exception{
        
        if(sacar <= 0) throw new Exception("Valor invalido!");
        if(sacar > saldo) throw new Exception("Saldo Insufuciente!");
      return  saldo -= sacar ;
      
    }
    
    //Metodo depositar
    public float depositarDinheiro(float deposito)throws Exception{
        
        if(deposito <= 0) throw new Exception("Deposite um valor valido!");
       return saldo+= deposito;
    }
}
