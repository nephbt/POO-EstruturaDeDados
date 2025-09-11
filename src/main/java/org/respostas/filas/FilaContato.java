package org.respostas.filas;

public class FilaContato {
    private Contato[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaContato(int capacidade) {
        this.elementos = new Contato[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public void adicionar(Contato contato) {
        if (tamanho == elementos.length) {
            throw new RuntimeException("A fila está cheia!");
        }
        fim++;
        elementos[fim] = contato;
        tamanho++;
    }

    public Contato remover() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia!");
        }
        Contato valor = elementos[inicio];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fim--;
        tamanho--;
        return valor;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}
