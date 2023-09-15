package Desafios.POO.SistemaIphone;

import Desafios.POO.AparelhoTelefonico.GereciaTelefone;
import Desafios.POO.NavegadorInternet.GerenciarNavegacao;
import Desafios.POO.ReprodutorMusical.GerenciarMusicas;

public class Sistema implements GereciaTelefone, GerenciarNavegacao, GerenciarMusicas {
    @Override
    public void ligar() {
        System.out.println("Ligando para contato pelo sistema");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada pelo sistema");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz pelo sistema");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página pelo sistema");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba pelo sistema");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página pelo sistema");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música pelo sistema");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música pelo sistema");
    }

    @Override
    public void selecionar() {
        System.out.println("Selecionando música pelo sistema");
    }
}
