
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Ala;
import view.CadastroAla;

public class ControllerCadastroAla implements ActionListener{
    
    CadastroAla cadastroAla;

    public ControllerCadastroAla(CadastroAla cadastroAla) {
        this.cadastroAla = cadastroAla;
       
        this.cadastroAla.getjButtonNovo().addActionListener(this);
        this.cadastroAla.getjButtonCancelar().addActionListener(this);
        this.cadastroAla.getjButtonGravar().addActionListener(this);
        this.cadastroAla.getjButtonBuscar().addActionListener(this);
        this.cadastroAla.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroAla.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroAla.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroAla.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroAla.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroAla.getjPanelDados());
            
        this.cadastroAla.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroAla.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroAla.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroAla.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroAla.getjButtonGravar()) {

            Ala ala = new Ala();
            
            
            
            ala.setId(model.bo.ClasseDadosGravacao.listaAla.size() + 1);
            ala.setDescricao(this.cadastroAla.getjTextField1().getText());
            ala.setStatus(this.cadastroAla.getjComboBox1().getSelectedItem()+ "");
          
            model.bo.ClasseDadosGravacao.listaAla.add(ala);

           
            
            utilities.Utilities.ativaDesativa(false, this.cadastroAla.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroAla.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroAla.getjButtonBuscar()) {
           
      
           
           JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaAla.toString());
            
        } else if (evento.getSource() == this.cadastroAla.getjButtonSair()) {
            this.cadastroAla.dispose();
        }

    }

}