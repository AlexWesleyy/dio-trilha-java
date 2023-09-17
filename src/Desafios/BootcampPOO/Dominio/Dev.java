package Desafios.BootcampPOO.Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {
    private String nome;
    private List<ConteudoEducacional> conteudosInscritos=new ArrayList<>();
    private List<ConteudoEducacional> conteudosConcluidos=new ArrayList<>();
    public void inscrever(ConteudoEducacional algumConteudo){
        if(conteudosInscritos.contains(algumConteudo)){
            System.err.println("Conteúdo já inscrito");
        }else{
            conteudosInscritos.add(algumConteudo);
        }

    }
    public void inscrever(Bootcamp algumBootcamp){
        for (ConteudoEducacional conteudo:algumBootcamp.getConteudos()) {
                    inscrever(conteudo);
        }
        algumBootcamp.getDevs().add(this);
    }
    public void progredir(){
        Optional<ConteudoEducacional> conteudo = conteudosInscritos.stream().findFirst();//Pega o primeiro adicionado, e devolve para a variavel
        if(conteudo.isPresent()){
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está mais inscrito em nenhum conteudo");
        }
    }

    public void exibir(){
        for (ConteudoEducacional conteudos:conteudosInscritos
        ) {
            System.out.println(conteudos.getTitulo());

        }
    }
    public double TotalXp(){
        return conteudosConcluidos.stream().mapToDouble(conteudo->conteudo.CalcularXp()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
