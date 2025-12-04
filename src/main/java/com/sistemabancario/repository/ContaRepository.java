package com.sistemabancario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sistemabancario.model.Conta;

@Repository
public class ContaRepository {
    private final List<Conta> contas = new ArrayList<>();

    public void salvar(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> listar() {
        return contas;
    }

    public Conta buscarPorNumero(int numero) {
        return contas.stream()
                .filter(c -> c.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }

    public boolean remover(int numero) {
        Conta c = buscarPorNumero(numero);
        if(c != null) return contas.remove(c);
        return false;
    }
}
