public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimir() {
        System.out.println("=== Extrato conta Corrente ===");
        super.imprimirInfosComuns();
    }    
}
