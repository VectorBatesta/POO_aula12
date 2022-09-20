package aula12;

public abstract class SistemaPagamento {
    private Conta conta;
    
    public SistemaPagamento(){
        this.conta = new Conta();
    }
}