public class Conta {
    private String nomeTitular;
    int numeroConta;
    private double saldo;

    public String getnomeTitular(){
        return  nomeTitular ;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
}