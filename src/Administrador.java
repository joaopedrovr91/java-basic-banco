public class Administrador extends Conta{

    public Administrador(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimir() {
        System.out.println("=== Acesso ADM ===");
        for (Cliente c : Cliente.getClientes()) {
            System.out.println("Cliente: " + c.getNome());
        }
    } 
}
