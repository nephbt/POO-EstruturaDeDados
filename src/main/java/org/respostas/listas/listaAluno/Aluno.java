package org.respostas.listas.listaAluno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String Nome;
    private int Matricula;
    private LocalDate DataNasc;

    public Aluno(String nome, int matricula, LocalDate dataNasc) {
        Nome = nome;
        Matricula = matricula;
        DataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome='" + Nome + '\'' +
                ", Matricula=" + Matricula +
                ", DataNasc=" + DataNasc +
                '}';
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public LocalDate getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        DataNasc = dataNasc;
    }


}
