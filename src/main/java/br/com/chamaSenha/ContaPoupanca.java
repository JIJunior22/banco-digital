package br.com.chamaSenha;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("*** EXTRATO CONTA POUPANÇA ***");
        super.dadosCaonta(super.cliente);
    }
}
