

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteMouseListener extends JFrame{
    
    public TesteMouseListener(String tituloJanela){
        super(tituloJanela);
        Container c = getContentPane();
    
        JPanel p1 = new JPanel();
        JButton b1=new JButton("Botão 1");
        p1.add(b1);
        c.add(p1);
        
        EventosMouse listener = new EventosMouse();
        b1.addMouseListener(listener);
        
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        TesteMouseListener frame = new TesteMouseListener("TesteMouseListener");
    }    
}
