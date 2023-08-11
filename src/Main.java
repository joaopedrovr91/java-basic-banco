public class Main {
    public static void main(String[] arg) {
        Cliente venilton = new Cliente("Venilton");
        Cliente joao = new Cliente("Joao");
        Cliente pedro = new Cliente("Pedro");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);
        Conta adm = new Administrador(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        adm.imprimir();
        cc.imprimir();
        poupanca.imprimir();
    }
}