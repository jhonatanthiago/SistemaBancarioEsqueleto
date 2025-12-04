package com.sistemabancario.model;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private String tipo; // "corrente" ou "poupanca"

    public Conta(int numero, String titular, String tipo) {
        this.numero = numero;
        this.titular = titular;
        this.tipo = tipo;
        this.saldo = 0;
    }

    public int getNumero() { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public String getTipo() { return tipo; }

    public void depositar(double valor) {
        if(valor > 0) saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}