package Desafios.SistemaBancarioComPOO.Banco;

import Desafios.SistemaBancarioComPOO.Contas.Conta;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }
    public void exibirContas(){
        System.out.println(String.format("=== Contas Cadastradas =="));
        for (Conta listaContas:this.contas
             ) {
            System.out.println(String.format("Nº Conta: %d - Titular: %s",listaContas.getNumeroConta(),listaContas.getCliente().getNome()));
        }
    }

}
