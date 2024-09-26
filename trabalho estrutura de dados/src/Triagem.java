public class Triagem {
    
    private Nodo primeiro;
    private Nodo ultimo;

    public Triagem() {
    }

    public Triagem(Nodo primeiro, Nodo ultimo) {
        this.primeiro = primeiro;
        this.ultimo = ultimo;
    }
 

    public void adicionarNoFinal(FichaAtendimento dado) {
        Nodo novoNodo = new Nodo(dado);
        if (this.primeiro == null) {
            this.primeiro = novoNodo;
            this.ultimo = novoNodo;
        } else {
            this.ultimo.prox = novoNodo;
            this.ultimo = novoNodo;
        }
    }

    public void adicionarPrioridade(FichaAtendimento dado) {
    Nodo novoNodo = new Nodo(dado);
    if (this.primeiro == null || dado.prioridade == 'U') {
        // Adiciona fichas vermellhas no início da fila
        if (this.primeiro == null || this.primeiro.dado.prioridade == 'N' || (dado.numero < this.primeiro.dado.numero && dado.prioridade == 'U')) {
            novoNodo.prox = this.primeiro;
            this.primeiro = novoNodo;
            if (this.ultimo == null) {
                this.ultimo = novoNodo;
            }
        } else {
            Nodo atual = this.primeiro;
            while (atual.prox != null && atual.prox.dado.prioridade == 'U' && atual.prox.dado.numero < dado.numero) {
                atual = atual.prox;
            }
            novoNodo.prox = atual.prox;
            atual.prox = novoNodo;
            if (novoNodo.prox == null) {
                this.ultimo = novoNodo;
            }
        }
    } else {
        // Adiciona fichas azuis no fnal da fila
        adicionarNoFinal(dado);
    }
}

    public void mostrarLista() {
        Nodo atual = this.primeiro;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
}



