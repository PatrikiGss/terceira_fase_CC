
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PainelCadastroCliente {
    private JButton btnsave;
    
    public PainelCadastroCliente(){
         initializeComponents();
    }
    
    private void initializeComponets(){
        btnsave= new JButton("salvar");
       btnsave.addMouseListener(new EventosMouse());
    }

    
    
    private void initializeComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
