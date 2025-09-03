package org.dominio;

import org.dominio.interfaces.IEstruturaDeDados;

public class Fila implements IEstruturaDeDados {
    @Override
    public void adicionar(int valor) {

    }

    @Override
    public char remover() {
        return '0';
    }

    @Override
    public int tamanho() {
        return 0;
    }

    @Override
    public boolean estaVazia() {
        return false;
    }
}
