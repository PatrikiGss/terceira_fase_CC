package arvore.binarias;

public class Arvore_Binaria {
    Nodo raiz;

    Arvore_Binaria() {
        raiz = null;
    }

    void inserir(int valor) {
        raiz = insereRecursivo(raiz, valor);
    }

    Nodo insereRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor)
            raiz.esq = insereRecursivo(raiz.esq, valor);
        else if (valor > raiz.valor)
            raiz.dir = insereRecursivo(raiz.dir, valor);

        return raiz;
    }

    boolean procura(int valor) {
        return procurarecursiva(raiz, valor);
    }

    boolean procurarecursiva(Nodo raiz, int valor) {
        if (raiz == null) {
            return false;
        }

        if (raiz.valor == valor) {
            return true;
        }

        // Corrigindo a lógica da busca
        if (valor < raiz.valor) {
            return procurarecursiva(raiz.esq, valor); // Buscar na subárvore esquerda
        }

        return procurarecursiva(raiz.dir, valor); // Buscar na subárvore direita
    }
    //
       // Método para imprimir a árvore
    void imprimeArvore() {
        imprimeArvoreRecursivo(raiz, 0);
    }

    // Método recursivo para imprimir a árvore com indentação
    void imprimeArvoreRecursivo(Nodo raiz, int espaco) {
        int count = 5;
        if (raiz == null)
            return;

        // Adiciona mais espaço entre os níveis
        espaco += count;

        // Processa o filho da direita primeiro
        imprimeArvoreRecursivo(raiz.dir, espaco);

        // Imprime o nó atual depois do espaço
        System.out.println();
        for (int i = count; i < espaco; i++)
            System.out.print(" ");
        System.out.println(raiz.valor);

        // Processa o filho da esquerda
        imprimeArvoreRecursivo(raiz.esq, espaco);
    }
}
