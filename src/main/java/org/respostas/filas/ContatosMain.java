package org.respostas.filas;

import java.util.Scanner;

public class ContatosMain {
    public static void main(String[] args) {
        FilaContato fila = new FilaContato(5);
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        while (continuar){
            System.out.println("==== FILA DE CONTATOS ====");
            System.out.println("1 - Inserir contato");
            System.out.println("2 - Próximo contato");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao){
                case(1):
                    System.out.println("== INSERIR CONTATO ==");
                    System.out.print("Nome: ");
                    String nome = sc.next();
                    System.out.print("Número: ");
                    int numero = sc.nextInt();

                    Contato c = new Contato(nome, numero);
                    fila.adicionar(c);
                    System.out.println("Contato inserido!\n");
                    break;
                case(2):
                    System.out.println("== PRÓXIMO CONTATO ==");
                    if (fila.estaVazia()) {
                        System.out.println("Nenhum contato na fila.\n");
                    } else {
                        Contato proximo = fila.remover();
                        System.out.println("Atendendo contato: " + proximo.getNome() + " - " + proximo.getNumero() + "\n");
                    }
                    break;
                case (3):
                    System.out.println("Encerrando...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
                    break;
            }
        }
    }
}
