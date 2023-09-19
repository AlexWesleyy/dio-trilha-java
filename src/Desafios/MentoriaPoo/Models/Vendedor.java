package Desafios.MentoriaPoo.Models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{
    private double valorBonificacao;
    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao=this.valorSalario*(porcentagemBonificacao/100d);
    }
    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }


}
