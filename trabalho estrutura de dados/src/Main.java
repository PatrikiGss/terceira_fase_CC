 public class Main {
        public static void main(String[] args) {
        
      Triagem fila=new Triagem();

        // Teste 1
        fila.adicionarPrioridade(new FichaAtendimento (1,'N'));
        fila.adicionarPrioridade(new FichaAtendimento(2, 'N'));
        fila.adicionarPrioridade(new FichaAtendimento(1, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(2, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(3, 'N'));
        fila.adicionarPrioridade(new FichaAtendimento(4, 'N'));
        fila.mostrarLista();

        // Teste 2
        fila = new  Triagem();
        fila.adicionarPrioridade(new FichaAtendimento(1, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(2, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(3, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(1, 'N'));
        fila.adicionarPrioridade(new FichaAtendimento(2, 'N'));
        fila.mostrarLista();

        // Teste 3
        fila = new Triagem();
        fila.adicionarPrioridade(new FichaAtendimento(1, 'N'));
        fila.adicionarPrioridade(new FichaAtendimento(2, 'N'));
        fila.adicionarPrioridade(new FichaAtendimento(3, 'N'));
        fila.adicionarPrioridade(new FichaAtendimento(4, 'N'));
        fila.adicionarPrioridade(new FichaAtendimento(1, 'U'));
        fila.mostrarLista();

        // Teste 4
        fila = new Triagem();
        fila.adicionarPrioridade(new FichaAtendimento(1, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(2, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(3, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(4, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(5, 'U'));
        fila.mostrarLista();

        // Teste 5
        fila = new Triagem();
        fila.adicionarPrioridade(new FichaAtendimento(1, 'N'));
        fila.adicionarPrioridade(new FichaAtendimento(1, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(2, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(2, 'N'));
        fila.adicionarPrioridade(new FichaAtendimento(3, 'U'));
        fila.adicionarPrioridade(new FichaAtendimento(3, 'N'));
        fila.mostrarLista();
    }
}
       
 