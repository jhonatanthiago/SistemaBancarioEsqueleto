package com.sistemabancario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sistemabancario.model.Conta;
import com.sistemabancario.repository.ContaRepository;

@Service
public class ContaService {
    private final ContaRepository repository;

    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }

    public Conta criarConta(int numero, String titular, String tipo) {
        Conta conta = new Conta(numero, titular, tipo);
        repository.salvar(conta);
        return conta;
    }

    public boolean depositar(int numero, double valor) {
        Conta c = repository.buscarPorNumero(numero);
        if(c != null) {
            c.depositar(valor);
            return true;
        }
        return false;
    }

    public boolean sacar(int numero, double valor) {
        Conta c = repository.buscarPorNumero(numero);
        if(c != null) {
            return c.sacar(valor);
        }
        return false;
    }

    public boolean transferir(int de, int para, double valor) {
        Conta cDe = repository.buscarPorNumero(de);
        Conta cPara = repository.buscarPorNumero(para);
        if(cDe != null && cPara != null && cDe.sacar(valor)) {
            cPara.depositar(valor);
            return true;
        }
        return false;
    }

    public List<Conta> listarContas() {
        return repository.listar();
    }

    public boolean removerConta(int numero) {
        return repository.remover(numero);
    }
}
