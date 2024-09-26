
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Acompanhante;
import view.CadastroAcompanhante;




public class ControllerCadastroAcompanhante implements ActionListener{
    
    CadastroAcompanhante cadastroAcompanhante;

    public ControllerCadastroAcompanhante(CadastroAcompanhante cadastroAcompanhante) {
        this.cadastroAcompanhante = cadastroAcompanhante;
       
        this.cadastroAcompanhante.getjButtonNovo().addActionListener(this);
        this.cadastroAcompanhante.getjButtonCancelar().addActionListener(this);
        this.cadastroAcompanhante.getjButtonGravar().addActionListener(this);
        this.cadastroAcompanhante.getjButtonBuscar().addActionListener(this);
        this.cadastroAcompanhante.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroAcompanhante.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroAcompanhante.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroAcompanhante.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroAcompanhante.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroAcompanhante.getjPanelDados());
            
        this.cadastroAcompanhante.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroAcompanhante.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroAcompanhante.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroAcompanhante.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroAcompanhante.getjButtonGravar()) {

            Acompanhante acompanhante = new Acompanhante();
            
            
            
            acompanhante.setId(model.bo.ClasseDadosGravacao.listaQuarto.size() + 1);
            acompanhante.setStatus(this.cadastroAcompanhante.getjTextField2().getText());
            acompanhante.setGrauParentesco(this.cadastroAcompanhante.getjTextField4().getText());
            acompanhante.setNome(this.cadastroAcompanhante.getjTextField1().getText());
            
            //acompanhante.setPrincipioAtivo(this.cadastroAcompanhante.getjTextField1().getText());
            //acompanhante.setQtdMinima(Float.parseFloat(this.cadastroAcompanhante.getjTextField3().getText()));
            
            //medicamento.setStatus(this.cadastroAcompanhante.getjComboBox1().getSelectedItem()+ "");
          
            model.bo.ClasseDadosGravacao.listaAcompanhante.add(acompanhante);

           
            
            utilities.Utilities.ativaDesativa(false, this.cadastroAcompanhante.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroAcompanhante.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroAcompanhante.getjButtonBuscar()) {
           
      
           
           JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaAcompanhante.toString());
            
        } else if (evento.getSource() == this.cadastroAcompanhante.getjButtonSair()) {
            this.cadastroAcompanhante.dispose();
        }

    }

}