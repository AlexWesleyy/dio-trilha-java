package Desafios.SistemaBancarioComPOO.Contas;

public interface FuncionalidadesConta {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();

}
