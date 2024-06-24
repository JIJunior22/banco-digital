package br.com.chamaSenha;

public interface AcoesBancarias {
    void sacar(double valor);


    void depositar(double valor);


    void transferir(Conta conta, double valor);
    void extrato();
}
