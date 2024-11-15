package com.dio.java.contas;

import com.dio.java.banco.Banco;
import com.dio.java.banco.Cliente;

public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;

    private Banco banco;
    private int agencia;
    private int conta;
    private  double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente, Banco banco){
        this.banco = banco;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getCliente()));
        System.out.println(String.format("Banco: %s", this.banco));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
