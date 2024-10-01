
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.bo.ClasseDadosGravacao;
import model.bo.Medico;
import view.BuscaMedico;
import view.CadastroMedico;



public class ControllerCadastroMedico implements ActionListener{
    
    CadastroMedico cadastroMedico;
    public static int codigo;

    public ControllerCadastroMedico(CadastroMedico cadastroMedico) {
        this.cadastroMedico = cadastroMedico;
       
        this.cadastroMedico.getjButtonNovo().addActionListener(this);
        this.cadastroMedico.getjButtonCancelar().addActionListener(this);
        this.cadastroMedico.getjButtonGravar().addActionListener(this);
        this.cadastroMedico.getjButtonBuscar().addActionListener(this);
        this.cadastroMedico.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroMedico.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroMedico.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroMedico.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroMedico.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroMedico.getjPanelDados());
            
        this.cadastroMedico.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroMedico.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroMedico.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroMedico.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroMedico.getjButtonGravar()) {

             Medico medico  = new Medico();
             
            medico.setId(model.bo.ClasseDadosGravacao.listaMedico.size() + 1);
            medico.setNome(this.cadastroMedico.getjTextField1().getText());
            medico.setNomeSocial(this.cadastroMedico.getjTextField3().getText());
            medico.setDataCadastro(this.cadastroMedico.getjFormattedTextField2().getText());
            medico.setCpfCnpj(this.cadastroMedico.getjFormattedTextField1().getText());
            medico.setRgInscricaoEstadual(this.cadastroMedico.getjFormattedTextField6().getText());
            medico.setSexo(this.cadastroMedico.getjComboBox3().getSelectedItem()+ "");
            medico.setEmail(this.cadastroMedico.getjTextField4().getText());
            medico.setFone1(this.cadastroMedico.getjFormattedTextField3().getText());
            medico.setFone2(this.cadastroMedico.getjFormattedTextField4().getText());
            medico.setCep(this.cadastroMedico.getjFormattedTextField5().getText());
            //medico.setCidade(this.cadastroMedico.getjFormattedTextField4().getText());
            //medico.setBairro(this.cadastroMedico.getjFormattedTextField4().getText());
            //medico.setLogradouro(this.cadastroMedico.getjFormattedTextField4().getText());
            medico.setComplemento(this.cadastroMedico.getjTextField2().getText());
            medico.setLogin(this.cadastroMedico.getjTextField5().getText());
            medico.setCrm(this.cadastroMedico.getjTextField12().getText());
            //medico.setSenha(this.cadastroMedico.getjPasswordField4().getText());
            //medico.setSenha(this.cadastroMedico.getjPasswordField3().getText());
            
            //problema no if abaixo, pois quando não passa na condição mesmo assim ele desativa os botões
          
          if (!this.cadastroMedico.getjPasswordField3().getText().equals(this.cadastroMedico.getjPasswordField4().getText())) {
                JOptionPane.showMessageDialog(null, "As senhas não correspondem.");
                return;   
                
            } else if (this.cadastroMedico.getjPasswordField3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo de senha não pode estar vazio.");
                return;
            
            }else if (this.cadastroMedico.getIdField().getText().equals("")) {
                    medico.setId(model.bo.ClasseDadosGravacao.listaMedico.size() + 1);
                    medico.setSenha(this.cadastroMedico.getjPasswordField3().getText());
                    ClasseDadosGravacao.listaMedico.add(medico);
            } else {
                    medico.setId(Integer.parseInt(this.cadastroMedico.getIdField().getText()));
                    ClasseDadosGravacao.listaMedico.set(codigo-1, medico);
                
                }
          
          
             utilities.Utilities.ativaDesativa(true, this.cadastroMedico.getjPanelBotoes());
             utilities.Utilities.limpaComponentes(false, this.cadastroMedico.getjPanelDados() );
           
        } else if (evento.getSource() == this.cadastroMedico.getjButtonBuscar()) {
           codigo = 0;
            BuscaMedico buscaMedico = new BuscaMedico(null, true);
            ControllerBuscaMedico controllerBuscaMedico = new ControllerBuscaMedico(buscaMedico);
            buscaMedico.setVisible(true);

            if (codigo != 0) {

                Medico medico = new Medico();
                medico = model.bo.ClasseDadosGravacao.listaMedico.get(codigo - 1);

                utilities.Utilities.ativaDesativa(true, this.cadastroMedico.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, this.cadastroMedico.getjPanelDados());

                this.cadastroMedico.getIdField().setText(medico.getId() + "");
                this.cadastroMedico.getjTextField1().setText(medico.getNome());
                this.cadastroMedico.getjTextField3().setText(medico.getNomeSocial());
                this.cadastroMedico.getjFormattedTextField2().setText(medico.getDataCadastro());
                this.cadastroMedico.getjFormattedTextField1().setText(medico.getCpfCnpj());
                this.cadastroMedico.getjFormattedTextField6().setText(medico.getRgInscricaoEstadual());
                this.cadastroMedico.getjComboBox3().setSelectedItem(medico.getSexo());
                this.cadastroMedico.getjTextField4().setText(medico.getEmail());
                this.cadastroMedico.getjFormattedTextField3().setText(medico.getFone1());
                this.cadastroMedico.getjFormattedTextField4().setText(medico.getFone2());
                this.cadastroMedico.getjTextField12().setText(medico.getCrm());
                this.cadastroMedico.getjFormattedTextField5().setText(medico.getCep());
                this.cadastroMedico.getjTextField2().setText(medico.getComplemento());
                this.cadastroMedico.getjTextField5().setText(medico.getLogin());
                this.cadastroMedico.getjPasswordField4().setText(medico.getSenha());
                this.cadastroMedico.getjPasswordField3().setText(medico.getSenha());

                this.cadastroMedico.getIdField().setEnabled(false);
                this.cadastroMedico.getjTextField1().requestFocus();

            }
      
           
           //JOptionPane.showMessageDialog(null, model.ClasseDadosGravacao.listaEnfermeiro.toString());
            
        } else if (evento.getSource() == this.cadastroMedico.getjButtonSair()) {
            this.cadastroMedico.dispose();
        }

    }

}