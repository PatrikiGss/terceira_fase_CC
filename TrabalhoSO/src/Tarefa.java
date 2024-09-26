
public class Tarefa {
    private int offset;
    private int tempoComputacao;
    private int periodo;

    public Tarefa(int offset, int tempoComputacao, int periodo) {
        this.offset = offset;
        this.tempoComputacao = tempoComputacao;
        this.periodo = periodo;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTempoComputacao() {
        return tempoComputacao;
    }

    public void setTempoComputacao(int tempoComputacao) {
        this.tempoComputacao = tempoComputacao;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
     @Override
    public String toString() {
        return "Tarefa[Offset=" + offset + ", Tempo de Computacao=" + tempoComputacao + ", Periodo=" + periodo + "]";
    }
}