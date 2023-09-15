package Desafios.POO.Usuario;

import Desafios.POO.AparelhoTelefonico.Telefone;
import Desafios.POO.NavegadorInternet.Navegador;
import Desafios.POO.ReprodutorMusical.PlayerDeMusica;
import Desafios.POO.SistemaIphone.Sistema;

public class Iphone {
    public static void main(String[] args) {
        Telefone iphone = new Telefone();
        Navegador iphone2 = new Navegador();
        PlayerDeMusica iphone3 = new PlayerDeMusica();
        Sistema telefone = new Sistema();
        telefone.ligar();
        iphone.ligar();
    }
}
