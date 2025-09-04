package org.respostas;

import org.dominio.Pilha;

import java.util.Scanner;

public class HistoricoNavegacao {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Digite um site (número inteiro) ou os comandos VOLTAR e SAIR ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("SAIR")){
                break;
            } else if (entrada.equalsIgnoreCase("VOLTAR")){
                if (!pilha.estaVazia()) {
                    int siteRemovido = pilha.remover();
                    System.out.println("Site removido: " + siteRemovido);
                } else {
                    System.out.println("Hsitórico vazio!");
                }
            } else {
                int site = Integer.parseInt(entrada);
                pilha.adicionar(site);
                System.out.println("Acessando o site: " + site);
            }
        }
        sc.close();
    }
}
