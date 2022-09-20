package aula12;

public final class CaixaEletronico extends SistemaPagamento
        implements IPagamento {
    private int numeroTerminal;
    
    public CaixaEletronico(int n){
        super();
        this.numeroTerminal = n;
    }
    
    public int getNumeroTerminal(){
        return this.numeroTerminal;
    }
    
    public void pagar(float valor){
        
    }
}
