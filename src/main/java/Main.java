// Classe principal para testar a Pilha
public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        System.out.println("Adicionando elementos...");
        pilha.adicionar(10);
        pilha.adicionar(20);
        pilha.adicionar(30);
        pilha.adicionar(40);
        /*pilha.adicionar(50);
        pilha.adicionar(60);*/

        System.out.println("Topo da pilha: " + pilha.peek()); // 30
        System.out.println("Tamanho da pilha: " + pilha.tamanho()); // 3

        System.out.println("Removendo elemento: " + pilha.remover()); // 30
        System.out.println("Topo atual: " + pilha.peek()); // 20
    }
}
