package Desafios.POO.ReprodutorMusical;

public class PlayerDeMusica implements GerenciarMusicas{
    @Override
    public void tocar() {
        System.out.println("Tocando música app player");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música app player");
    }

    @Override
    public void selecionar() {
        System.out.println("Selecionando música app player");
    }
}
