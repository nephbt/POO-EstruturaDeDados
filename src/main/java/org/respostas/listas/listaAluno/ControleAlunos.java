package org.respostas.listas.listaAluno;


import org.respostas.listas.listaAluno.Aluno;

import java.util.ArrayList;
import java.util.List;

public class ControleAlunos {
    public List<Aluno> listaAlunos = new ArrayList<>();

    public void Cadastrar(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public List<Aluno> ListarTodos(){
        return listaAlunos;
    }

    public Aluno Pesquisar(int matricula){
        for (Aluno a : listaAlunos) {
            if (a.getMatricula() == matricula){
                return a;
            } else {
                System.out.println("Aluno não existe.");
            }
        }
        return null;
    }
    public void Remover(int matricula){
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getMatricula() == matricula) {
                listaAlunos.remove(i);
                System.out.println("Aluno removido!");
                return;
            }
        }
        System.out.println("Aluno não existe.");
    }
}
