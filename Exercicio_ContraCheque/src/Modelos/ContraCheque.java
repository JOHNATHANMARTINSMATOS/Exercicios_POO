/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author jonat
 */
public class ContraCheque {
    
    //Atributos da classe
    
    private String nome = "";
    private int matricula = 0;
    private int numeroDeDependentes = 0;
    private float salarioBase = 0;
    private int producao = 0;

    
    //Metodos acessores
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() throws Exception {
        if(matricula <= 0)throw new Exception("Matricula Invalida!");
        return matricula;
    }

    public void setMatricula(int matricula)throws Exception{
        if(matricula <= 0)throw new Exception("Matricula Invalida!");
        this.matricula = matricula;
    }

    public int getNumeroDeDependentes()throws Exception {
        
        if(numeroDeDependentes < 0) throw new Exception("Numero de dependentes invalido!");
        return numeroDeDependentes;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes)throws Exception {
        if(numeroDeDependentes < 0) throw new Exception("Numero de dependentes invalido!");
        this.numeroDeDependentes = numeroDeDependentes;
    }

    public float getSalarioBase()throws Exception{
        if(salarioBase <=0) throw new Exception("Salario Invalido");
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase)throws Exception{
         if(salarioBase <=0) throw new Exception("Salario Invalido");
        this.salarioBase = salarioBase;
    }

    public int getProducao()throws Exception {
        if(producao <= 0) throw new Exception("Digite Produção do funcionario maior que zero!");
        return producao;
    }

    public void setProducao(int producao)throws Exception {
        if(producao <= 0) throw new Exception("Digite Produção do funcionario maior que zero!");
        this.producao = producao;
    }
    
    
    // Construtor da classe
    
    public ContraCheque(String nome, int matricula, int numeroDeDependentes,
            float salarioBase, int producao)throws Exception{
        
        this.nome = nome;
         if(matricula <= 0)throw new Exception("Matricula Invalida!");
        this.matricula = matricula;
        
         if(numeroDeDependentes < 0) throw new Exception("Numero de dependentes invalido!");
        this.numeroDeDependentes = numeroDeDependentes;
        
         if(producao <= 0) throw new Exception("Digite Produção do funcionario maior que zero!");
        this.producao = producao;
        
         if(salarioBase <=0) throw new Exception("Salario Invalido");
        this.salarioBase = salarioBase;
    }
    
    // Metodo para calcular salario bruto
    
    public float calcularSalarioBruto(){
        float gratificacao = valorGratificacao();
        return  (float) (salarioBase + gratificacao);
    }
    // Metodo para calcular INSS
    
    public float calcularDescontoInss (){
        float salarioBruto = calcularSalarioBruto();
        if(salarioBruto <= 1302.00) return (float) (salarioBruto * 0.075);
        if(salarioBruto <= 2571.29) return (float)(salarioBruto * 0.090);
        if (salarioBruto <= 3856.94) return (float)(salarioBruto * 0.12);
        return (float) (salarioBruto * 0.14);
       
    }
     // Metodo para calcular dsconto de dependentes
    
    public float calcularDescontoDependentes(){
        return (float) (numeroDeDependentes * 123.00);
    }
    
    //metodo para calcular IRPF
    
    public float calcularDescontoIrpf(){
        float salarioBruto = calcularSalarioBruto();
        float descontoDependente = calcularDescontoDependentes();
        float imposto = 0;
        if(salarioBruto <= 1903.98) return 0;
        else if(salarioBruto <= 2826.65) { imposto = (float) (salarioBruto  * 0.075 - descontoDependente);}
        else if(salarioBruto <= 3751.05) { imposto = (float) (salarioBruto   * 0.15 - descontoDependente);}
        else if(salarioBruto <= 4664.68) { imposto = (float) (salarioBruto  * 0.22 - descontoDependente );}
        else if (salarioBruto > 4664.68) { imposto = (float) (salarioBruto  * 0.275  - descontoDependente);}
        if(imposto < 0){ return 0;}
        else{
        return imposto;}
        
    }
    
   
    
    //Metodo calcular salario liquido
    
    public float calcularSalarioliquido(){
        float salarioBruto = calcularSalarioBruto();
        float inss = calcularDescontoInss();
        float imposto = calcularDescontoIrpf();
        return salarioBruto - inss - imposto;
        
    }
    
    //Metodo mostrar valor da gratificação
    
    public float valorGratificacao(){
        if(producao <=1000) return  (float) 500.00;
        if(producao <= 2000) return (float) 1250.00;
        if(producao > 2000) return  (float) 2250.00;
        return 0;
    }
    
}
