package org.respostas.listas.listaAluno;

import java.time.LocalDate;
import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args) {
        ControleAlunos controle = new ControleAlunos();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostra o menu
            System.out.println("\n===== Menu de Alunos =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar Todos");
            System.out.println("3 - Pesquisar");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("== Cadastrar aluno ==");
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Matrícula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Data de nascimento (AAAA-MM-DD): ");
                    LocalDate dataNasc = LocalDate.parse(sc.nextLine());

                    Aluno aluno = new Aluno(nome, matricula, dataNasc);
                    controle.Cadastrar(aluno);
                    System.out.println("Aluno cadastrado!");
                    break;

                case 2:
                    System.out.println("== Listar todos os alunos ==");
                    System.out.println(controle.ListarTodos());
                    break;

                case 3:
                    System.out.println("== Pesquisar aluno ==");
                    System.out.println("Entre com a matrícula: ");
                    int matriculaPesquisar = sc.nextInt();
                    System.out.println(controle.Pesquisar(matriculaPesquisar));
                    break;

                case 4:
                    System.out.println("== Remover aluno ==");
                    System.out.println("Entre com a matrícula para remover: ");
                    int matriculaRemover = sc.nextInt();
                    controle.Remover(matriculaRemover);
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}