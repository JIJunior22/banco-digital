package br.com.chamaSenha;

public class Main {
    public static void main(String[] args) {
        Cliente junior = new Cliente();
        junior.setNome("Junior");

        Cliente luke = new Cliente();
        luke.setNome("Luke");

        Conta corrente=new ContaCorrente(junior);
        Conta poupanca=new ContaPoupanca(luke);

        corrente.depositar(100);
        poupanca.depositar(200);

        corrente.sacar(75);
        poupanca.sacar(35);

        corrente.extrato();
        poupanca.extrato();




    }
}