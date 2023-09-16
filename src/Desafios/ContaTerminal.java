package Desafios;

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor informe o número da conta: ");
        int numeroUsuario=s.nextInt();
        System.out.print("Por favor digite o número da Agência: ");
        String agencia = s.next();
        s.nextLine();
        System.out.print("Por favor digite seu nome: ");
        String nomeCliente = s.nextLine();
        System.out.print("Infome o saldo: ");
        double saldo=s.nextDouble();
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nomeCliente,agencia,numeroUsuario,saldo);
    }
}