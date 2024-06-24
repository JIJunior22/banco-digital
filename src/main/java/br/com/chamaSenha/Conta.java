package br.com.chamaSenha;

import lombok.Data;

@Data
public abstract class Conta implements AcoesBancarias {
    private int agencia;
    private int numero;
    private double saldo;
    private static final int AGENCIA_PADRAO = 001;
    protected Cliente cliente;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0;
    }



    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("--".repeat(20));


    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$ " + valor + " realizado com sucesso!");
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("--".repeat(20));


    }

    @Override
    public void transferir(Conta conta, double valor) {
        this.sacar(valor);
        conta.depositar(valor);
        System.out.println(cliente+"Transferencia de R$ " + valor + " realizado com sucesso!");
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("--".repeat(20));


    }

    public void dadosCaonta(Cliente cliente) {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Conta: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("==".repeat(20));
    }


}
