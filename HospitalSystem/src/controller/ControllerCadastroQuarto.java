
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Quarto;
import view.CadastroQuarto;


public class ControllerCadastroQuarto implements ActionListener{
    
    CadastroQuarto cadastroQuarto;

    public ControllerCadastroQuarto(CadastroQuarto cadastroQuarto) {
        this.cadastroQuarto = cadastroQuarto;
       
        this.cadastroQuarto.getjButtonNovo().addActionListener(this);
        this.cadastroQuarto.getjButtonCancelar().addActionListener(this);
        this.cadastroQuarto.getjButtonGravar().addActionListener(this);
        this.cadastroQuarto.getjButtonBuscar().addActionListener(this);
        this.cadastroQuarto.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroQuarto.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroQuarto.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroQuarto.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroQuarto.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroQuarto.getjPanelDados());
            
        this.cadastroQuarto.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroQuarto.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroQuarto.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroQuarto.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroQuarto.getjButtonGravar()) {

            Quarto quarto = new Quarto();
            
            
            
            quarto.setId(model.bo.ClasseDadosGravacao.listaQuarto.size() + 1);
            quarto.setDescricao(this.cadastroQuarto.getjTextField1().getText());
            quarto.setStatus(this.cadastroQuarto.getjComboBox1().getSelectedItem()+ "");
          
            model.bo.ClasseDadosGravacao.listaQuarto.add(quarto);

           
            
            utilities.Utilities.ativaDesativa(false, this.cadastroQuarto.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroQuarto.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroQuarto.getjButtonBuscar()) {
           
      
           
           JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaQuarto.toString());
            
        } else if (evento.getSource() == this.cadastroQuarto.getjButtonSair()) {
            this.cadastroQuarto.dispose();
        }

    }

}