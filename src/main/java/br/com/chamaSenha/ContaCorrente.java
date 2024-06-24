package br.com.chamaSenha;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }



    @Override
    public void extrato() {
        System.out.println("*** EXTRATO CONTA CORRENTE ***");
        super.dadosCaonta(super.cliente);
    }
}
