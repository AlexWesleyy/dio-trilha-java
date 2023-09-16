package Desafios.SistemaBancarioComPOO.Contas;

import Desafios.SistemaBancarioComPOO.Clientes.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.InformarDados();
    }
}
