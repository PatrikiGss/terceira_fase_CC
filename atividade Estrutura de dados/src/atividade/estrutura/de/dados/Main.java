
package atividade.estrutura.de.dados;
public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        Nodo nodo1 = new Nodo();
        nodo1.setValor(1);

        Nodo nodo2 = new Nodo();
        nodo2.setValor(2);

        Nodo nodo3 = new Nodo();
        nodo3.setValor(3);

        lista.inserirInicio(nodo1);
        lista.inserirFim(nodo2);
        lista.inserirFim(nodo3);

        System.out.println("Lista inicial:");
        lista.imprimirLista();

        lista.retirarInicio();
        System.out.println("Lista apos retirar o início:");
        lista.imprimirLista();

        lista.retirarFinal();
        System.out.println("Lista apos retirar o final:");
        lista.imprimirLista();

        Nodo nodo4 = new Nodo();
        nodo4.setValor(4);

        // Inserindo nodo4 na posição 1 (segunda posição)
        lista.inserirPosicaoEspecifica(nodo4, 1);
        System.out.println("Lista apos insercao na posicao específica:");
        lista.imprimirLista();

        // Removendo nodo na posição 1 (segunda posição)
        lista.removerPosicaoEspecifica(1);
        System.out.println("Lista apos remocao na posicao especifica:");
        lista.imprimirLista();
    }
}