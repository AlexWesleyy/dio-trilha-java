package Desafios.SistemaBancarioComPOO.Contas;

import Desafios.SistemaBancarioComPOO.Clientes.Cliente;

public abstract class Conta implements FuncionalidadesConta{
    private static int SEQUENCIA=1;
    private static final int NumeroAgencia=1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia=Conta.NumeroAgencia;
        this.numeroConta=SEQUENCIA++;
        this.cliente=cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo>=valor){
            this.saldo-=valor;
        }else{
            System.out.println("Valor de saque inválido!!!");
        }

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(this.saldo>=valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else{
            System.out.println("O Valor de sua transferência é inválido!!!");
        }
    }

    protected void InformarDados() {
        System.out.printf("Titular: %s\nNº Agencia: %d\nNº da Conta: %d\nSaldo: %.2f\n",this.cliente.getNome(),this.agencia,this.numeroConta,this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
