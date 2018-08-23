
package br.ufpr.oo2018.banco;

/**
 *
 * @author helio
 */
public class ContaCorrente {
    
    //atributos:
    private double saldo;
    private String nomeCliente;
    private int numConta;
    private int numAgencia;
    
    public ContaCorrente(String nomeCliente, int numConta, 
            int numAgencia) {
        
        this.saldo = 0;
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    
    public void depositar(double quantia) {
        if (quantia <= 0){
            System.out.println("Erro: Deve ser maior que zero");
            return;
        }
        //else
        this.saldo += quantia;
    }
    
    public double sacar(double quantia) {
        if (debitar(quantia)){
            return quantia;
        }
        return 0.0;
        
    }
    
    public boolean debitar(double quantia) {
        if (quantia > this.saldo){
            System.out.println("Erro: Não tem saldo suficiente para sacar essa quantia");
            return false;
        }
        if (quantia <= 0) {
            System.out.println("Erro: quantia invalida");
            return false;
        }
        this.saldo -= quantia;
        return true;
    }
    
    public void transferir(double quantia, ContaCorrente dest){
        dest.depositar(quantia);
        this.debitar(quantia);
        
    }
    
    
}
