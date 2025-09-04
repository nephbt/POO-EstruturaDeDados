package org.respostas;

import org.dominio.Pilha;

import java.util.Scanner;

public class EditorTexto {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(100);
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Diite um caracter ou os comandos BACKSPACE/ENTER.");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("ENTER")){
                String resultado = "";
                while (!pilha.estaVazia()) {
                    resultado = pilha.remover() + resultado; // reconstruir na ordem correta
                }
                System.out.println("Texto final: " + resultado);
                break;
            } else if (resposta.equalsIgnoreCase("BACKSPACE")){
                if (!pilha.estaVazia()){
                    char remover = (char) pilha.remover();
                    System.out.println("Removido: " + remover);
                } else {
                    System.out.println("A pilha está vazia!");
                }
            } else {
                char carac = resposta.charAt(0);
                pilha.adicionar(carac);
                System.out.println("Adicionado: " +carac);
            }
        }
        sc.close();
    }
}
