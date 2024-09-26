import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Files;


public class FCFS {
    public static void main(String[] args) {
        // Lógica de leitura do arquivo JSON e criação dos objetos DadosdaSimulacao

        // Simulação com FCFS
        DadosdaSimulacao dados = lerDadosDaSimulacaoDoArquivo("C:\\Users\\User\\Downloads\\schedParams.json");
        if (dados != null) {
            Tarefa[] tarefas = dados.getTarefas();
            int tempoTotalSimulacao = dados.getTemposimulacao();

            // FCFS
            int tempoAtual = 0;
            double utilizacaoSistema = 0.0;
            double turnaroundTimeTotal = 0.0;
            double waitingTimeTotal = 0.0;
            int maiorWaitingTime = Integer.MIN_VALUE;
            int menorWaitingTime = Integer.MAX_VALUE;
            Tarefa tarefaComMaiorWaitingTime = null;
            Tarefa tarefaComMenorWaitingTime = null;
            Tarefa tarefaComStarvation = null;

            for (Tarefa tarefa : tarefas) {
                // Executa a tarefa
                if (tempoAtual < tarefa.getOffset()) {
                    tempoAtual = tarefa.getOffset();
                }
                int turnaroundTime = tempoAtual + tarefa.getTempoComputacao() - tarefa.getOffset();
                int waitingTime = tempoAtual - tarefa.getOffset();
                utilizacaoSistema += (double) tarefa.getTempoComputacao() / tarefa.getPeriodo();
                turnaroundTimeTotal += turnaroundTime;
                waitingTimeTotal += waitingTime;
                if (waitingTime > maiorWaitingTime) {
                    maiorWaitingTime = waitingTime;
                    tarefaComMaiorWaitingTime = tarefa;
                }
                if (waitingTime < menorWaitingTime) {
                    menorWaitingTime = waitingTime;
                    tarefaComMenorWaitingTime = tarefa;
                }
                tempoAtual += tarefa.getTempoComputacao();
            }

            // Calcula métricas
            int numTarefas = tarefas.length;
            double turnaroundTimeMedio = turnaroundTimeTotal / numTarefas;
            double waitingTimeMedio = waitingTimeTotal / numTarefas;
            double utilizacaoMediaSistema = utilizacaoSistema / numTarefas;

            // Verifica se alguma tarefa sofre de starvation
            for (Tarefa tarefa : tarefas) {
                if ((double) tarefa.getTempoComputacao() / tarefa.getPeriodo() > utilizacaoMediaSistema) {
                    tarefaComStarvation = tarefa;
                    break;
                }
            }

            // Saída dos resultados
            System.out.println("----------(FCFS)-------------");
            for (Tarefa tarefa : tarefas) {
                System.out.println("Tarefa com offset " + tarefa.getOffset() + " executou.");
            }
            System.out.println("Nivel de utilizacao do sistema: " + utilizacaoMediaSistema);
            System.out.println("Turnaround time medio: " + turnaroundTimeMedio);
            System.out.println("Waiting time medio: " + waitingTimeMedio);
            System.out.println("Tarefa com maior waiting time medio: " + tarefaComMaiorWaitingTime);
            System.out.println("Tarefa com menor waiting time medio: " + tarefaComMenorWaitingTime);
            if (tarefaComStarvation != null) {
                System.out.println("Tarefa com starvation: " + tarefaComStarvation);
            } else {
                System.out.println("Nenhuma tarefa sofre de starvation.");
            }
        }
    }

   // Método para ler os dados da simulação do arquivo JSON
public static DadosdaSimulacao lerDadosDaSimulacaoDoArquivo(String caminhoarquivo) {
    try {
        // Lê o conteúdo do arquivo JSON
        String conteudoJSON = new String(Files.readAllBytes(Paths.get(caminhoarquivo)));
        // Converte o conteúdo para JSON
        JSONObject objetoJson = new JSONObject(conteudoJSON);
        // Extrai informações do JSON
        int tempoSimulacao = objetoJson.getInt("simulation_time");
        String nomeEscalonador = objetoJson.optString("scheduler_name");
        int numeroTarefas = objetoJson.getInt("tasks_number");
        JSONArray arrayTarefas = objetoJson.getJSONArray("tasks");

        // Extrai os detalhes de cada tarefa
        Tarefa[] tarefas = new Tarefa[numeroTarefas];
        for (int i = 0; i < numeroTarefas; i++) {
            JSONObject objetoTarefa = arrayTarefas.getJSONObject(i);
            int offset = objetoTarefa.getInt("offset");
            int tempoComputacao = objetoTarefa.getInt("computation_time");
            int periodo = objetoTarefa.getInt("period_time");
            tarefas[i] = new Tarefa(offset, tempoComputacao, periodo);
        }

        // Retorna os dados da simulação
        return new DadosdaSimulacao(tempoSimulacao, nomeEscalonador, tarefas);
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
}
