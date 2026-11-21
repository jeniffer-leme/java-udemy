package aulas.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class TratadorDeEventos implements ActionListener {
    
    private JTextField campoTexto;

    public TratadorDeEventos(JTextField campoTexto) {
        setCampoTexto(campoTexto);          
    }
    
    private void setCampoTexto(JTextField campoTexto) {
        if(campoTexto != null) {
            this.campoTexto = campoTexto;
        } else {
            throw new IllegalArgumentException("campoTexto não pode ser nulo.");
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //System.out.println("Ocorreu um Evento");
        //System.out.println(ae.getActionCommand());
        
        String texto = campoTexto.getText();
        if(texto.isEmpty() == false) {
            if(ae.getActionCommand().equals("Excluir")) {
                campoTexto.setText("");
            } else if(ae.getActionCommand().equals("Salvar")) {
                System.out.println(texto); //exemplo salvar
                campoTexto.setText("");
            }
        }
    
    }
}
