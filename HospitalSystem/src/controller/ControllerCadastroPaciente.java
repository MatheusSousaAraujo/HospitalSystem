
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.bo.ClasseDadosGravacao;
import model.bo.Paciente;
import view.BuscaPaciente;
import view.CadastroPaciente;



public class ControllerCadastroPaciente implements ActionListener{
    
    CadastroPaciente cadastroPaciente;
    public static int codigo;

    public ControllerCadastroPaciente(CadastroPaciente cadastroPaciente) {
        this.cadastroPaciente = cadastroPaciente;
       
        this.cadastroPaciente.getjButtonNovo().addActionListener(this);
        this.cadastroPaciente.getjButtonCancelar().addActionListener(this);
        this.cadastroPaciente.getjButtonGravar().addActionListener(this);
        this.cadastroPaciente.getjButtonBuscar().addActionListener(this);
        this.cadastroPaciente.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroPaciente.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroPaciente.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroPaciente.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroPaciente.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroPaciente.getjPanelDados());
            
        this.cadastroPaciente.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroPaciente.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroPaciente.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroPaciente.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroPaciente.getjButtonGravar()) {

             Paciente paciente  = new Paciente();
             
            paciente.setId(model.bo.ClasseDadosGravacao.listaPaciente.size() + 1);
            paciente.setNome(this.cadastroPaciente.getjTextField1().getText());
            paciente.setNomeSocial(this.cadastroPaciente.getjTextField3().getText());
            paciente.setDataCadastro(this.cadastroPaciente.getjFormattedTextField2().getText());
            paciente.setCpfCnpj(this.cadastroPaciente.getjFormattedTextField1().getText());
            paciente.setRgInscricaoEstadual(this.cadastroPaciente.getjFormattedTextField6().getText());
            paciente.setSexo(this.cadastroPaciente.getjComboBox3().getSelectedItem()+ "");
            paciente.setEmail(this.cadastroPaciente.getjTextField4().getText());
            paciente.setFone1(this.cadastroPaciente.getjFormattedTextField3().getText());
            paciente.setFone2(this.cadastroPaciente.getjFormattedTextField4().getText());
            paciente.setCep(this.cadastroPaciente.getjFormattedTextField5().getText());
            //paciente.setCidade(this.cadastroPaciente.getjFormattedTextField4().getText());
            //paciente.setBairro(this.cadastroPaciente.getjFormattedTextField4().getText());
            //paciente.setLogradouro(this.cadastroPaciente.getjFormattedTextField4().getText());
            paciente.setComplemento(this.cadastroPaciente.getjTextField2().getText());
            
            if (this.cadastroPaciente.getIdField().getText().equals("")) {
                    paciente.setId(model.bo.ClasseDadosGravacao.listaPaciente.size() + 1);
                    ClasseDadosGravacao.listaPaciente.add(paciente);
            } else {
                    paciente.setId(Integer.parseInt(this.cadastroPaciente.getIdField().getText()));
                    ClasseDadosGravacao.listaPaciente.set(codigo-1, paciente);
                }
          
          
             utilities.Utilities.ativaDesativa(true, this.cadastroPaciente.getjPanelBotoes());
             utilities.Utilities.limpaComponentes(false, this.cadastroPaciente.getjPanelDados() );
           
        } else if (evento.getSource() == this.cadastroPaciente.getjButtonBuscar()) {
           codigo = 0;
            BuscaPaciente buscaPaciente = new BuscaPaciente(null, true);
            ControllerBuscaPaciente controllerBuscaPaciente = new ControllerBuscaPaciente(buscaPaciente);
            buscaPaciente.setVisible(true);

            if (codigo != 0) {

                Paciente paciente = new Paciente();
                paciente = model.bo.ClasseDadosGravacao.listaPaciente.get(codigo - 1);

                utilities.Utilities.ativaDesativa(true, this.cadastroPaciente.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, this.cadastroPaciente.getjPanelDados());

                this.cadastroPaciente.getIdField().setText(paciente.getId() + "");
                this.cadastroPaciente.getjTextField1().setText(paciente.getNome());
                this.cadastroPaciente.getjFormattedTextField3().setText(paciente.getFone1());
                this.cadastroPaciente.getjComboBox4().setSelectedItem(paciente.getCpfCnpj());

                this.cadastroPaciente.getIdField().setEnabled(false);
                this.cadastroPaciente.getjTextField1().requestFocus();

            }
      
           
           //JOptionPane.showMessageDialog(null, model.ClasseDadosGravacao.listaEnfermeiro.toString());
            
        } else if (evento.getSource() == this.cadastroPaciente.getjButtonSair()) {
            this.cadastroPaciente.dispose();
        }

    }

}