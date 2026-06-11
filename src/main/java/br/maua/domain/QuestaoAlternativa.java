package br.maua.domain;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestaoAlternativa extends Questao {

    private List <Alternativa> alternativas = new ArrayList<>();
    private boolean alternativaAssinalada;

    public QuestaoAlternativa() {}

    public QuestaoAlternativa(String enunciado, Tarefa tarefa) {
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }

    @Override
    public void questaoCommit(Connection cx) throws SQLException {

    }
}

