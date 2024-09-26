package frame.gui;

import frame.util.CodeException;
import java.awt.BorderLayout;
import javax.swing.*;

public class PanelCadastroClientes extends JPanel {

    private JLabel lNome;
    private JTextField tfNome;
    private JLabel lTelefone;
    private JTextField tfTelefone;
    private JLabel lID;
    private JTextField tfID;
    private JLabel lCPF;
    private JTextField tfCPF;
    private JPanel pCadastroCliente;
    private JPanel pBotoesCadastro;
    private JButton bExcluir;
    private JButton bSalvar;
    private JButton bNovo;

    /**
     * Este construtor monta um Panel para insercao de dados de Cadastro de Clientes,
     */
    public PanelCadastroClientes() throws CodeException {
        this.setLayout(new BorderLayout());
        // Montagem do panel para insercao ou edicao de um cliente
        pCadastroCliente = montaPanelCadastroCliente();
        // Montagem do panel com botoes para salvar ou excluir clientes
        pBotoesCadastro = montaPanelBotoesCadastro();
        /**************************************************************************
         * Adicao dos paineis pCadastroCliente e pBotoesCadastro no panel principal
         *************************************************************************/
        this.add(pCadastroCliente, BorderLayout.CENTER);
        this.add(pBotoesCadastro, BorderLayout.SOUTH);
    }

    /**
     * Metodo utilizado internamente para montagem do JPanel com o botao Salvar, por isto ele foi declarado como
     * private.
     *
     * @return JPanel com o botao Salvar, para salvar um cliente
     */
    private JPanel montaPanelBotoesCadastro() {
        JPanel pBotoesCadastro = new JPanel();
        // Implementação do painel de botões
        bSalvar = new JButton("Salvar");
        bExcluir = new JButton("Excluir");
        bNovo = new JButton("Novo");

        // Adicionando os botões ao painel
        pBotoesCadastro.add(bSalvar);
        pBotoesCadastro.add(bExcluir);
        pBotoesCadastro.add(bNovo);

        // Associando teclas aos botões
        bSalvar.setMnemonic('S');
        bExcluir.setMnemonic('E');
        bNovo.setMnemonic('N');

        return pBotoesCadastro;
    }

    /**
     * Metodo utilizado internamente para montagem do JPanel para cadastro ou edicao de um cliente, por isto ele foi
     * declarado como private.
     *
     * @return JPanel para cadastro ou edicao de um cliente
     */
    private JPanel montaPanelCadastroCliente() {
        JPanel pCadastroCliente = new JPanel();
        // Implementação do painel de cadastro de clientes
        lNome = new JLabel("Nome:");
        tfNome = new JTextField(20);
        lTelefone = new JLabel("Telefone:");
        tfTelefone = new JTextField(10);
        lID = new JLabel("ID:");
        tfID = new JTextField(5);
        lCPF = new JLabel("CPF:");
        tfCPF = new JTextField(11);

        // Adicionando componentes ao painel
        pCadastroCliente.add(lNome);
        pCadastroCliente.add(tfNome);
        pCadastroCliente.add(lTelefone);
        pCadastroCliente.add(tfTelefone);
        pCadastroCliente.add(lID);
        pCadastroCliente.add(tfID);
        pCadastroCliente.add(lCPF);
        pCadastroCliente.add(tfCPF);

        return pCadastroCliente;
    }
}
