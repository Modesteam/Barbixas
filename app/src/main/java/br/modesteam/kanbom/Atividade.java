package br.modesteam.kanbom;

import java.util.Date;

/**
 * Created by ricardo on 10/04/15.
 */
public class Atividade {
    private String nome;
    private String descricao;
    private String status;
    private String dataFinal;

    public Atividade(String nome, String descricao, String status, String dataFinal) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.dataFinal = dataFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
}
