
package br.ufpr.oo2018.banco;

/**
 *
 * @author helio
 */
public class ContaCorrente extends Conta {
    
    private double limiteChequeEspecial;
    
    public ContaCorrente(String nomeCliente, int numConta, 
            int numAgencia) {
        super(nomeCliente, numConta, numAgencia);
        limiteChequeEspecial = 100;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    
    
    
    

    
}
