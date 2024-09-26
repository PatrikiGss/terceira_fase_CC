
public class DadosdaSimulacao {
   private int tempodeSimulacao; 
   private String nomeEscalonador;
   private Tarefa[] tarefas;

    public DadosdaSimulacao(int temposimulacao, String nomeEscalonador, Tarefa[] tarefas) {
        this.tempodeSimulacao = tempodeSimulacao;
        this.nomeEscalonador = nomeEscalonador;
        this.tarefas = tarefas;
    }

    public int getTemposimulacao() {
        return tempodeSimulacao;
    }

    public void setTemposimulacao(int temposimulacao) {
        this.tempodeSimulacao = temposimulacao;
    }

    public String getNomeEscalonador() {
        return nomeEscalonador;
    }

    public void setNomeEscalonador(String nomeEscalonador) {
        this.nomeEscalonador = nomeEscalonador;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
   
   
}
