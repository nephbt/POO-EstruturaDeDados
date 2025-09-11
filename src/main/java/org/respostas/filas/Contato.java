package org.respostas.filas;

public class Contato {
    private String Nome;
    private int Numero;

    public Contato(String nome, int numero) {
        Nome = nome;
        Numero = numero;
    }

    public String getNome() {
        return Nome;
    }

    public int getNumero() {
        return Numero;
    }
}
