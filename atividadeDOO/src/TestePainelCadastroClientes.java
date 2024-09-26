import javax.swing.*;

public class TestePainelCadastroClientes extends JFrame {
    
    
        public static void main(String[] args) {
        // Cria uma instância do gerenciador de cadastro de clientes
        TestePainelCadastroClientes gerenciador = new TestePainelCadastroClientes("Gerenciador de Cadastro de Clientes");
    }


    public TestePainelCadastroClientes(String titulo) {
        super(titulo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            // Configura a interface gráfica para cadastro de clientes
            configurarInterfaceCadastroClientes();
            // Define o tamanho da janela e a torna visível
            this.setSize(300, 200);
            this.setVisible(true);
        } catch (Exception e) {
            // Exibe uma mensagem de erro se ocorrer uma exceção
            exibirMensagemErro("Ocorreu um erro: " + e.getMessage());
        }
    }

    private void configurarInterfaceCadastroClientes() {
        // Adiciona o painel de cadastro de clientes à janela
        this.getContentPane().add(new PainelCadastroClientes());
    }

    private void exibirMensagemErro(String mensagem) {
        // Exibe uma caixa de diálogo com a mensagem de erro
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}


