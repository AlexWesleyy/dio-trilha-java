package Desafios.SistemaBancarioComPOO.Contas;

import Desafios.SistemaBancarioComPOO.Clientes.Cliente;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.InformarDados();
    }


}
