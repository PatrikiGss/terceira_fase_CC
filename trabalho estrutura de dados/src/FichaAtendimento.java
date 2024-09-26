public class FichaAtendimento {
     int numero;
    char prioridade;  // n (normal) e u (urgente)
     public FichaAtendimento(int numero, char prioridade) {
        this.numero = numero;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return numero + "-" + prioridade;
    }
}