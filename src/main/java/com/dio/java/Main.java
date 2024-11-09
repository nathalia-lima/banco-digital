package com.dio.java;

import com.dio.java.banco.Banco;
import com.dio.java.banco.Cliente;
import com.dio.java.contas.Conta;
import com.dio.java.contas.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        // criando um banco
        Banco banco = new Banco("Banco Nathalia");

        // incluindo clientes no banco
        banco.incluirCliente("Nathalia", 1000000, 900082080);
        banco.incluirCliente("Danielle", 1000000, 907420080);
        banco.incluirCliente("Rosimar", 1000000, 900450080);

        //listando clientes do banco
        banco.exibirClientes();

        // criando uma conta para um cliente
        Cliente cliente1 = banco.buscarCliente("Nathalia");
        Conta conta1 = new ContaCorrente(cliente1, banco);

        // criando uma conta para um cliente
        Cliente cliente2 = banco.buscarCliente("Danielle");
        Conta conta2 = new ContaCorrente(cliente2, banco);

        // adicionando infos na conta1
        conta1.depositar(1000);
        conta1.transferir(100, conta2);

        //verificando contas
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();





    }
}
