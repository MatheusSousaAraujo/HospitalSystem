
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Medicamento;
import view.CadastroMedicamento;



public class ControllerCadastroMedicamento implements ActionListener{
    
    CadastroMedicamento cadastroMedicamento;

    public ControllerCadastroMedicamento(CadastroMedicamento cadastroMedicamento) {
        this.cadastroMedicamento = cadastroMedicamento;
       
        this.cadastroMedicamento.getjButtonNovo().addActionListener(this);
        this.cadastroMedicamento.getjButtonCancelar().addActionListener(this);
        this.cadastroMedicamento.getjButtonGravar().addActionListener(this);
        this.cadastroMedicamento.getjButtonBuscar().addActionListener(this);
        this.cadastroMedicamento.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroMedicamento.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroMedicamento.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroMedicamento.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroMedicamento.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroMedicamento.getjPanelDados());
            
        this.cadastroMedicamento.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroMedicamento.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroMedicamento.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroMedicamento.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroMedicamento.getjButtonGravar()) {

            Medicamento medicamento = new Medicamento();
            
            
            
            medicamento.setId(model.bo.ClasseDadosGravacao.listaQuarto.size() + 1);
            medicamento.setStatus(this.cadastroMedicamento.getjTextField2().getText());
            medicamento.setDescricaoMedicamento(this.cadastroMedicamento.getjTextField4().getText());
            medicamento.setPrincipioAtivo(this.cadastroMedicamento.getjTextField1().getText());
            medicamento.setQtdMinima(Float.parseFloat(this.cadastroMedicamento.getjTextField3().getText()));
            
            //medicamento.setStatus(this.cadastroMedicamento.getjComboBox1().getSelectedItem()+ "");
          
            model.bo.ClasseDadosGravacao.listaMedicamento.add(medicamento);

           
            
            utilities.Utilities.ativaDesativa(false, this.cadastroMedicamento.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroMedicamento.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroMedicamento.getjButtonBuscar()) {
           
      
           
           JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaMedicamento.toString());
            
        } else if (evento.getSource() == this.cadastroMedicamento.getjButtonSair()) {
            this.cadastroMedicamento.dispose();
        }

    }

}