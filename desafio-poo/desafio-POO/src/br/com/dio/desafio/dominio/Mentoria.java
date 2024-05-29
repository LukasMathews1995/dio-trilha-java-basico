package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

 private LocalDate data= LocalDate.now();


    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }




    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("Mentoria : %s  Descricao : %s   Carga Horária : %s\n",getTitulo(),getDescricao(),getData());
    }
}
