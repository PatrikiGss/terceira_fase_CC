/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteMouseListener3 extends JFrame{
    private JLabel lTexto = new JLabel("Texto inicial");
    
    public TesteMouseListener3(String tituloJanela){
        super(tituloJanela);
        
        Container c = getContentPane();
        JPanel p1 = new JPanel();
        
        JButton b1 = new JButton("Botão 1");
        p1.add(b1);
        p1.add(lTexto);
        c.add(b1);
        
        EventosMouse listener = new EventosMouse();
        b1.addMouseListener(listener);
        setSize(200,200);
        setVisible(true);        
    }
    /*Estendemos MouseAdapter e desta  forma não é necessário implementarmos todos os seus métodos, 
    apenas sobrescrevemos os necessários */
    
    public class EventosMouse extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            lTexto.setText("mouseClicked");
            System.out.println("mouseClicked");
        }
    }
    public static void main(String[] args) {
        TesteMouseListener3 frame= new TesteMouseListener3 ("TesteMouseListener");
    }
}