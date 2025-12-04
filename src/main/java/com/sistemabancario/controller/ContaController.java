package com.sistemabancario.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sistemabancario.model.Conta;
import com.sistemabancario.service.ContaService;

@RestController
@RequestMapping("/contas")
public class ContaController {

    private final ContaService service;

    public ContaController(ContaService service) {
        this.service = service;
    }

    @PostMapping("/criar")
    public Conta criarConta(@RequestParam int numero,
                             @RequestParam String titular,
                             @RequestParam String tipo) {
        return service.criarConta(numero, titular, tipo);
    }

    @PostMapping("/depositar")
    public String depositar(@RequestParam int numero, @RequestParam double valor) {
        if(service.depositar(numero, valor)) return "Deposito realizado";
        return "Conta não encontrada";
    }

    @PostMapping("/sacar")
    public String sacar(@RequestParam int numero, @RequestParam double valor) {
        if(service.sacar(numero, valor)) return "Saque realizado";
        return "Saque não realizado: saldo insuficiente ou conta não existe";
    }

    @PostMapping("/transferir")
    public String transferir(@RequestParam int de,
                             @RequestParam int para,
                             @RequestParam double valor) {
        if(service.transferir(de, para, valor)) return "Transferencia realizada";
        return "Transferencia não realizada";
    }

    @GetMapping("/listar")
    public List<Conta> listar() {
        return service.listarContas();
    }

    @DeleteMapping("/remover")
    public String remover(@RequestParam int numero) {
        if(service.removerConta(numero)) return "Conta removida";
        return "Conta não encontrada";
    }
}
