package org.respostas;

import org.dominio.PilhaEncadeada;

import java.util.Scanner;

public class BalanceamentoParenteses {
    public static void main(String[] args) {
        PilhaEncadeada pilhaE = new PilhaEncadeada();
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a expressão matemática: ");
        String expressao = sc.nextLine();

        String avisoErro = "Os parênteses não estão balanceados!!";
        String avisoSucesso = "Parabéns, os parênteses estão balanceados!";

        for (char c : expressao.toCharArray()){
            if (c == '('){
                pilhaE.adicionar(c);
            }
            if (c == ')'){
                if (pilhaE.estaVazia()){
                    System.out.println(avisoErro);
                    return;
                } else {
                    pilhaE.remover();
                }
            }
        }

        if (pilhaE.estaVazia()) {
            System.out.println(avisoSucesso);
        } else {
            System.out.println(avisoErro);
        }
    }
}
