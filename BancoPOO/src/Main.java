import banco.conta.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente nathan = new Cliente();
        nathan.setNome("Nathan");

        Conta cc = new ContaCorrente(nathan);
        Conta poupanca = new ContaPoupanca(nathan);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}