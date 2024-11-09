package com.dio.java.contas;

import com.dio.java.banco.Banco;
import com.dio.java.banco.Cliente;
import com.dio.java.contas.Conta;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}
