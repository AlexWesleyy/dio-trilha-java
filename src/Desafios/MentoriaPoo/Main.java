package Desafios.MentoriaPoo;

import Desafios.MentoriaPoo.Models.Endereco;
import Desafios.MentoriaPoo.Models.Gerente;
import Desafios.MentoriaPoo.Models.OperadorDeCaixa;
import Desafios.MentoriaPoo.Models.Vendedor;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Madalena Nunes","Casa","Centro");

        Vendedor vendedor01=new Vendedor();
        vendedor01.setNome("Alex");
        vendedor01.setDocumento("Vendedor chefe");
        vendedor01.setValorSalario(1000d);
        vendedor01.setEndereco(endereco);
        vendedor01.calculaBonificacao(2.0);
        System.out.println(vendedor01);

        OperadorDeCaixa operador = new OperadorDeCaixa("Alex Op Caixa","062748803-00",2500d,endereco);

        System.out.println(operador);

        Gerente gerente = new Gerente();
        gerente.setNome("Wesley");
        gerente.setDocumento("006-623-749-01");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3.0);
        System.out.println(gerente);
    }

}
