package com.dio.java.contas;

import com.dio.java.banco.Banco;
import com.dio.java.banco.Cliente;
import com.dio.java.contas.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }

}
