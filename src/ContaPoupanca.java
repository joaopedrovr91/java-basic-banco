public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimir() {
        System.out.println("=== Extrato conta Poupança ===");
        super.imprimirInfosComuns();
    } 
}
