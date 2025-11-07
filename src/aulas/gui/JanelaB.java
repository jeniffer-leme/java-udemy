package aulas.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

    public class JanelaB extends JFrame implements ActionListener {

    private JLabel jLabelId;
    private JTextField jTextFieldId;
    private JButton jButtonExcluir;
    private JButton jButtonSalvar;
    
    public JanelaB() {
        setTitle("Janela B");
        setSize(960, 540);
        
        setLayout(null);
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        jLabelId = new JLabel();
        jLabelId.setText("ID: ");
        jLabelId.setBounds(50, 50, 25, 25);
        add(jLabelId);
        
        jTextFieldId = new JTextField(25);
        jTextFieldId.setBounds(75, 50, 100, 25);
        add(jTextFieldId);
        
        jButtonExcluir = new JButton();
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setBounds(715, 465, 100, 25);
        
        jButtonExcluir.addActionListener(this);
        
        add(jButtonExcluir);
        
        jButtonSalvar = new JButton();
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBounds(835, 465, 100, 25);
        
        jButtonSalvar.addActionListener(this);
        
        add(jButtonSalvar);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String texto = jTextFieldId.getText();
        
        if(!texto.isEmpty()) {
            if(ae.getActionCommand().equals("Salvar")) {
                System.out.println(texto);
            }
            
            jTextFieldId.setText("");
        }
    }
    
    
}
