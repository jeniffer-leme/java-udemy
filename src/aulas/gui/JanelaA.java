package aulas.gui;

import javax.swing.JFrame;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;


public class JanelaA extends JFrame {

    private JLabel jLabelId;
    private JTextField jTextFieldId;
    private JButton jButtonExcluir;
    private JButton jButtonSalvar;
    
    public JanelaA() {
        setTitle("Janela A");
        setSize(960, 540);
        
        setLayout(null);
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        jLabelId = new JLabel();
        jLabelId.setText("ID: ");
        jLabelId.setBounds(50, 50, 100, 25);
        add(jLabelId);
        
        jTextFieldId = new JTextField(25);
        jTextFieldId.setBounds(150, 50, 100, 25);
        add(jTextFieldId);
        
        jButtonExcluir = new JButton();
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setBounds(715, 465, 100, 25);
        TratadorDeEventos obj = new TratadorDeEventos(jTextFieldId);
        
        jButtonExcluir.addActionListener(obj);
        
        add(jButtonExcluir);
        
        jButtonSalvar = new JButton();
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBounds(835, 465, 100, 25);
        
        jButtonSalvar.addActionListener(obj);
        
        add(jButtonSalvar);
        
        setVisible(true);
    }
    
    
}
