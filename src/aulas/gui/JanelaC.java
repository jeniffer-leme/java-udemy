package aulas.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JanelaC extends JFrame implements ActionListener{
    
    private JMenuBar jMenuBar;
    
    private JMenu jMenu1;
    private JMenu jMenu2;
    
    private JMenuItem jMenuItemA;

    public JanelaC() {
        setTitle("Janela C");
        setSize(960, 540);
        
        setLayout(null);
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jMenuBar = new JMenuBar();
        jMenuBar.setBounds(0, 0, 960, 25);
        add(jMenuBar);
        
        jMenu1 = new JMenu("Menu 1");
        jMenuBar.add(jMenu1);
        
        jMenu2 = new JMenu("Menu 2");
        jMenuBar.add(jMenu2);
         
        jMenuItemA = new JMenuItem("Janela A");
        jMenu1.addActionListener(this);
        jMenu1.add(jMenuItemA);
    
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Janela A")) {
            JanelaA janelaA = new JanelaA();
        }
    }
    
}
