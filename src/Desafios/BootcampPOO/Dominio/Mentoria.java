package Desafios.BootcampPOO.Dominio;

import java.time.LocalDateTime;

public class Mentoria extends ConteudoEducacional{

    private LocalDateTime data;

    @Override
    public double CalcularXp() {
        return XP_PADRAO;
    }
    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }


}
