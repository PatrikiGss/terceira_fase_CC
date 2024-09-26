
package atividade.estrutura.de.dados;
class ListaEncadeada {
    private Nodo lista;

    public ListaEncadeada() {
        this.lista = null;
    }

    public Nodo getLista() {
        return lista;
    }

    public void setLista(Nodo lista) {
        this.lista = lista;
    }

    public void inserirInicio(Nodo novoNodo) {
        if (this.lista == null) {
            this.lista = novoNodo;
        } else {
            novoNodo.setProx(this.lista);
            this.lista = novoNodo;
        }
    }

    public void inserirFim(Nodo novoNodo) {
        if (this.lista == null) {
            this.lista = novoNodo;
        } else {
            Nodo aux = this.lista;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNodo);
        }
    }

    public void inserirPosicaoEspecifica(Nodo novoNodo, int posicao) {
        if (posicao < 0) {
            System.out.println("Posição inválida");
            return;
        }

        if (posicao == 0) {
            inserirInicio(novoNodo);
            return;
        }

        Nodo anterior = null;
        Nodo atual = this.lista;
        int contador = 0;

        while (atual != null && contador < posicao) {
            anterior = atual;
            atual = atual.getProx();
            contador++;
        }

        if (contador == posicao) {
            novoNodo.setProx(atual);
            anterior.setProx(novoNodo);
        } else {
            System.out.println("Posição excede o tamanho da lista");
        }
    }

    public void retirarInicio() {
        if (this.lista == null) {
            System.out.println("Lista vazia");
        } else {
            this.lista = this.lista.getProx();
        }
    }

    public void retirarFinal() {
        if (this.lista == null) {
            System.out.println("Lista vazia");
        } else {
            Nodo aux = this.lista;
            Nodo anterior = null;

            while (aux.getProx() != null) {
                anterior = aux;
                aux = aux.getProx();
            }

            if (anterior == null) {
                this.lista = null;
            } else {
                anterior.setProx(null);
            }
        }
    }

    public void removerPosicaoEspecifica(int posicao) {
        if (posicao < 0) {
            System.out.println("Posição inválida");
            return;
        }

        if (posicao == 0) {
            retirarInicio();
            return;
        }

        Nodo anterior = null;
        Nodo atual = this.lista;
        int contador = 0;

        while (atual != null && contador < posicao) {
            anterior = atual;
            atual = atual.getProx();
            contador++;
        }

        if (atual != null) {
            anterior.setProx(atual.getProx());
        } else {
            System.out.println("Posição excede o tamanho da lista");
        }
    }

    public void imprimirLista() {
        Nodo aux = this.lista;
        while (aux != null) {
            System.out.print(aux.getValor() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }
}
