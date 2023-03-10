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
        if(matricula <= 0)throw new Exception("Matricula deve ser maior que zero!");
        return matricula;
    }

    public void setMatricula(int matricula)throws Exception{
        if(matricula <= 0)throw new Exception("Matricula deve ser maior que zero!");
        this.matricula = matricula;
    }

    public int getNumeroDeDependentes() {
        return numeroDeDependentes;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes) {
        this.numeroDeDependentes = numeroDeDependentes;
    }

    public float getSalarioBase()throws Exception{
        if(salarioBase <=0) throw new Exception("Salario deve ser maior que zero");
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase)throws Exception{
         if(salarioBase <=0) throw new Exception("Salario deve ser maior que zero");
        this.salarioBase = salarioBase;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }
    
    
    // Construtor da classe
    
    public ContraCheque(String nome, int matricula, int numeroDeDependentes,
            float salarioBase, int producao)throws Exception{
        
        this.nome = nome;
        if(matricula <= 0)throw new Exception("Matricula deve ser maior que zero!");
        this.matricula = matricula;
        this.numeroDeDependentes = numeroDeDependentes;
        this.producao = producao;
         if(salarioBase <=0) throw new Exception("Salario deve ser maior que zero");
        this.salarioBase = salarioBase;
    }
    
    // Metodo para calcular salario bruto
    
    public float calcularSalarioBruto(){
        float gratificacao = valorGratificacao();
        if(producao <=1000) return  (float) (salarioBase + gratificacao);
        if(producao <= 2000) return (float)(salarioBase + gratificacao);
        if(producao > 2000) return  (float) (salarioBase + gratificacao);
        return calcularSalarioBruto();
    }
    // Metodo para calcular INSS
    
    public float calcularDescontoInss (){
        float salarioBruto = calcularSalarioBruto();
        if(salarioBruto <= 1302.00) return (float) (salarioBruto * 0.075);
        if(salarioBruto <= 2571.29) return (float)(salarioBruto * 0.090);
        if (salarioBruto <= 3856.94) return (float)(salarioBruto * 0.12);
        if(salarioBruto > 3856.94) return (float) (salarioBruto * 0.14);
        return calcularDescontoInss();
    }
     // Metodo para calcular dsconto de dependentes
    
    public float calcularDescontoDependentes(){
        return (float) (numeroDeDependentes * 123.00);
    }
    
    //metodo para calcular IRPF
    
    public float calcularDescontoIrpf(){
        float salarioBruto = calcularSalarioBruto();
        float descontoDependente = calcularDescontoDependentes();
        if(salarioBruto <= 1903.98) return 0;
        if(salarioBruto <= 2826.65) return(float) (salarioBruto  * 0.075 - descontoDependente);
        if(salarioBruto <= 3751.05)  return(float) (salarioBruto   * 0.15 - descontoDependente);
        if(salarioBruto <= 4664.68) return(float) (salarioBruto  * 0.22 - descontoDependente );
        if(salarioBruto > 4664.68) return(float) (salarioBruto  * 0.275  - descontoDependente);
        return calcularDescontoIrpf();
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
        return valorGratificacao();
    }
    
}
