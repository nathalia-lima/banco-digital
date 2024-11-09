package com.dio.java.banco;

public class Cliente {
    private String cliente;
    private int documento;
    private double telefone;

    public Cliente(String cliente, int documento, double telefone) {
        this.cliente = cliente;
        this.documento = documento;
        this.telefone = telefone;
    }

    public String getCliente() {
        return cliente;
    }
    public int getDocumento() {
        return documento;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.cliente + " - Documento: " + this.documento + " - Telefone: " + this.telefone;
    }
}
