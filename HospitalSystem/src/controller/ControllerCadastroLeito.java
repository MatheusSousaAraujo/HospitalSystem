
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Leito;
import view.CadastroLeito;

public class ControllerCadastroLeito implements ActionListener{
    
    CadastroLeito cadastroLeito;

    public ControllerCadastroLeito(CadastroLeito cadastroLeito) {
        this.cadastroLeito = cadastroLeito;
       
        this.cadastroLeito.getjButtonNovo().addActionListener(this);
        this.cadastroLeito.getjButtonCancelar().addActionListener(this);
        this.cadastroLeito.getjButtonGravar().addActionListener(this);
        this.cadastroLeito.getjButtonBuscar().addActionListener(this);
        this.cadastroLeito.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroLeito.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroLeito.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroLeito.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroLeito.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroLeito.getjPanelDados());
            
        this.cadastroLeito.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroLeito.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroLeito.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroLeito.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroLeito.getjButtonGravar()) {

            Leito leito = new Leito();
            
            
            
            leito.setId(model.bo.ClasseDadosGravacao.listaLeito.size() + 1);
            leito.setDescricao(this.cadastroLeito.getjTextField1().getText());
            leito.setStatus(this.cadastroLeito.getjComboBox1().getSelectedItem()+ "");
          
            model.bo.ClasseDadosGravacao.listaLeito.add(leito);

           
            
            utilities.Utilities.ativaDesativa(false, this.cadastroLeito.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroLeito.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroLeito.getjButtonBuscar()) {
           
      
           
           JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaLeito.toString());
            
        } else if (evento.getSource() == this.cadastroLeito.getjButtonSair()) {
            this.cadastroLeito.dispose();
        }

    }

}