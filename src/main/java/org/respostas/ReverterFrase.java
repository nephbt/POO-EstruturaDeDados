package org.respostas;

import org.dominio.PilhaEncadeada;

import java.util.Scanner;

public class ReverterFrase {
    public static void main(String[] args) {
        PilhaEncadeada pilhaE = new PilhaEncadeada();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua palavra: ");
        String palavra = sc.nextLine();

        for (char c : palavra.toCharArray()){
            pilhaE.adicionar((int) c);
        }

        String invertida="";
        while (!pilhaE.estaVazia()){
            invertida += pilhaE.remover();
        }

        System.out.println("Palavra original: " +palavra);
        System.out.println("Palavra invertida: " +invertida);
    }
}
