package Desafios.POO.AparelhoTelefonico;

public class Telefone implements GereciaTelefone{
    @Override
    public void ligar() {
        System.out.println("Ligando para contato pelo app telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo app telefone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz pelo app telefone");
    }
}
