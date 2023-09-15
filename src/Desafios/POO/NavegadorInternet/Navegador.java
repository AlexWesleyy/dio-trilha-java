package Desafios.POO.NavegadorInternet;

import Desafios.POO.AparelhoTelefonico.GereciaTelefone;

public class Navegador implements GerenciarNavegacao {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página pelo app Navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba pelo app Navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página pelo app Navegador");
    }
}
