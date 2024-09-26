import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelCadastroClientes extends JPanel {

    private JLabel rotuloNome;
    private JTextField campoNome;
    private JLabel rotuloTelefone;
    private JTextField campoTelefone;
    private JLabel rotuloID;
    private JTextField campoID;
    private JLabel rotuloCPF;
    private JTextField campoCPF;
    private final JPanel painelCadastroCliente;
    private final JPanel painelBotoesCadastro;
    private JButton botaoExcluir;
    private JButton botaoSalvar;
    private JButton botaoNovo;

    public PainelCadastroClientes() {
        this.setLayout(new BorderLayout());

        // Monta o painel de cadastro de cliente
        painelCadastroCliente = montaPainelCadastroCliente();
        // Monta o painel de botões para salvar, excluir e novo
        painelBotoesCadastro = montaPainelBotoesCadastro();

        // Adiciona os painéis ao painel principal
        this.add(painelCadastroCliente, BorderLayout.CENTER);
        this.add(painelBotoesCadastro, BorderLayout.SOUTH);
    }

    private JPanel montaPainelBotoesCadastro() {
        JPanel painelBotoesCadastro = new JPanel();
        botaoSalvar = new JButton("Salvar");
        botaoExcluir = new JButton("Excluir");
        botaoNovo = new JButton("Novo");

        painelBotoesCadastro.add(botaoSalvar);
        painelBotoesCadastro.add(botaoExcluir);
        painelBotoesCadastro.add(botaoNovo);

        // Adicionar os listeners de evento para os botões
        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão Salvar clicado.");
            }
        });

        botaoExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão Excluir clicado.");
            }
        });

        botaoNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão Novo clicado.");
            }
        });

        return painelBotoesCadastro;
    }
    
     private JPanel montaPainelCadastroCliente() {
        JPanel painelCadastroCliente = new JPanel(new GridLayout(4, 2, 5, 5)); // GridLayout de 4 linhas e 2 colunas com espaçamento
        rotuloNome = new JLabel("Nome:");
        campoNome = new JTextField(20); // 20 colunas de largura
        rotuloTelefone = new JLabel("Telefone:");
        campoTelefone = new JTextField(10); // 10 colunas de largura
        rotuloID = new JLabel("ID:");
        campoID = new JTextField(5); // 5 colunas de largura
        rotuloCPF = new JLabel("CPF:");
        campoCPF = new JTextField(11); // 11 colunas de largura

        painelCadastroCliente.add(rotuloNome);
        painelCadastroCliente.add(campoNome);
        painelCadastroCliente.add(rotuloTelefone);
        painelCadastroCliente.add(campoTelefone);
        painelCadastroCliente.add(rotuloID);
        painelCadastroCliente.add(campoID);
        painelCadastroCliente.add(rotuloCPF);
        painelCadastroCliente.add(campoCPF);

        return painelCadastroCliente;
    }
}
