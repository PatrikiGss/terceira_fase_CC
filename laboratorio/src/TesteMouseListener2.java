/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteMouseListener2 extends JFrame implements MouseListener{
    private JLabel lTexto = new JLabel ("Texto inicial");
    
    public TesteMouseListener2(String tituloJanela){
        super(tituloJanela);
        Container c = getContentPane();
    
        JPanel p1 = new JPanel();
        JButton b1 = new JButton("Botão 1");
        p1.add(b1);
        p1.add(lTexto);
        c.add(p1);
        
        //this pois a interface esta implementada aqui mesmo
        b1.addMouseListener(this);
        setSize(200,200);
        setVisible(true);
    }
    /*Implementamos na mesma classe, os métodos da interface MouseListener */
     public void mousePressed(MouseEvent e){
        lTexto.setText("MousePressed");
         System.out.println("MousePressed");
    }
    public void mouseReleased(MouseEvent e){
        lTexto.setText("MouseReleased");
        System.out.println("MouseReleased");
    }
    public void mouseEntered(MouseEvent e){
        lTexto.setText("MouseEntered");
        System.out.println("MouseEntered");
    }
    public void mouseExited(MouseEvent e){
        lTexto.setText("MouseExited");
        System.out.println("MouseExited");
    }
    public void mouseClicked(MouseEvent e){
        lTexto.setText("mouseEvent");
        System.out.println("MouseEvent");
    }   
    public static void main(String[] args) {
        TesteMouseListener2 frame = new TesteMouseListener2("TesteMouseListener");
    }  
}