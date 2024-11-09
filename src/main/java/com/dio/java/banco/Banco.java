package com.dio.java.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.clientes = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void incluirCliente(String cliente, int documento, double telefone){
        clientes.add(new Cliente(cliente, documento, telefone));
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getCliente().equals(nome)) {
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado!");
        return null;
    }

    public void exibirClientes(){
        if (!clientes.isEmpty()){
            System.out.println(clientes);
        } else {
            System.out.println("Este banco ainda não possui clientes!");
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
