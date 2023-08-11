import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
        private static List<Cliente> clientes = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
        clientes.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }
}
