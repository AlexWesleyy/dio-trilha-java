package Desafios.SistemaBancarioComPOO;

import Desafios.SistemaBancarioComPOO.Banco.Banco;
import Desafios.SistemaBancarioComPOO.Clientes.Cliente;
import Desafios.SistemaBancarioComPOO.Contas.Conta;
import Desafios.SistemaBancarioComPOO.Contas.ContaCorrente;
import Desafios.SistemaBancarioComPOO.Contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente01=new Cliente("Alex");
        ContaCorrente cc = new ContaCorrente(cliente01);
        Cliente cliente02 = new Cliente("Ana");
        ContaPoupanca cp = new ContaPoupanca(cliente02);
        List<Conta> conta = new ArrayList<>();
        conta.add(cc);
        conta.add(cp);
        Banco bancoDoBrasil = new Banco("Banco do Brasil",conta);
        cc.depositar(100);
        cp.depositar(100);
        cc.sacar(20);
        cp.transferir(30,cc);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        bancoDoBrasil.exibirContas();
    }
}
