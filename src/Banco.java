import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
        public List<Cliente> getContas() {
        return contas;
    }

    public void setContas(List<Cliente> contas) {
        this.contas = contas;
    }

}
