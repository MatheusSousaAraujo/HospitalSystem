
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.bo.ClasseDadosGravacao;
import model.bo.Farmaceutico;
import view.BuscaFarmaceutico;
import view.CadastroFarmaceutico;



public class ControllerCadastroFarmaceutico implements ActionListener{
    
    CadastroFarmaceutico cadastroFarmaceutico;
    public static int codigo;

    public ControllerCadastroFarmaceutico(CadastroFarmaceutico cadastroFarmaceutico) {
        this.cadastroFarmaceutico = cadastroFarmaceutico;
       
        this.cadastroFarmaceutico.getjButtonNovo().addActionListener(this);
        this.cadastroFarmaceutico.getjButtonCancelar().addActionListener(this);
        this.cadastroFarmaceutico.getjButtonGravar().addActionListener(this);
        this.cadastroFarmaceutico.getjButtonBuscar().addActionListener(this);
        this.cadastroFarmaceutico.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroFarmaceutico.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroFarmaceutico.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroFarmaceutico.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroFarmaceutico.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroFarmaceutico.getjPanelDados());
            
        this.cadastroFarmaceutico.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroFarmaceutico.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroFarmaceutico.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroFarmaceutico.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroFarmaceutico.getjButtonGravar()) {

             Farmaceutico farmaceutico  = new Farmaceutico();
             
            farmaceutico.setId(model.bo.ClasseDadosGravacao.listaFarmaceutico.size() + 1);
            farmaceutico.setNome(this.cadastroFarmaceutico.getjTextField1().getText());
            farmaceutico.setNomeSocial(this.cadastroFarmaceutico.getjTextField3().getText());
            farmaceutico.setDataCadastro(this.cadastroFarmaceutico.getjFormattedTextField2().getText());
            farmaceutico.setCpfCnpj(this.cadastroFarmaceutico.getjFormattedTextField1().getText());
            farmaceutico.setRgInscricaoEstadual(this.cadastroFarmaceutico.getjFormattedTextField6().getText());
            farmaceutico.setSexo(this.cadastroFarmaceutico.getjComboBox3().getSelectedItem()+ "");
            farmaceutico.setEmail(this.cadastroFarmaceutico.getjTextField4().getText());
            farmaceutico.setFone1(this.cadastroFarmaceutico.getjFormattedTextField3().getText());
            farmaceutico.setFone2(this.cadastroFarmaceutico.getjFormattedTextField4().getText());
            farmaceutico.setCep(this.cadastroFarmaceutico.getjFormattedTextField5().getText());
            //farmaceutico.setCidade(this.cadastroFarmaceutico.getjFormattedTextField4().getText());
            //farmaceutico.setBairro(this.cadastroFarmaceutico.getjFormattedTextField4().getText());
            //farmaceutico.setLogradouro(this.cadastroFarmaceutico.getjFormattedTextField4().getText());
            farmaceutico.setComplemento(this.cadastroFarmaceutico.getjTextField2().getText());
            farmaceutico.setLogin(this.cadastroFarmaceutico.getjTextField5().getText());
            farmaceutico.setCrf(this.cadastroFarmaceutico.getjTextField12().getText());
            //farmaceutico.setSenha(this.cadastroFarmaceutico.getjPasswordField4().getText());
            //farmaceutico.setSenha(this.cadastroFarmaceutico.getjPasswordField3().getText());
            
            //problema no if abaixo, pois quando não passa na condição mesmo assim ele desativa os botões
          
          if (!this.cadastroFarmaceutico.getjPasswordField3().getText().equals(this.cadastroFarmaceutico.getjPasswordField4().getText())) {
                JOptionPane.showMessageDialog(null, "As senhas não correspondem.");
                return;   
            } else if (this.cadastroFarmaceutico.getjPasswordField3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo de senha não pode estar vazio.");
                return;
            } else if (this.cadastroFarmaceutico.getIdField().getText().equals("")) {
                    farmaceutico.setId(model.bo.ClasseDadosGravacao.listaFarmaceutico.size() + 1);
                    farmaceutico.setSenha(this.cadastroFarmaceutico.getjPasswordField3().getText());
                    ClasseDadosGravacao.listaFarmaceutico.add(farmaceutico);
            } else {
                    farmaceutico.setId(Integer.parseInt(this.cadastroFarmaceutico.getIdField().getText()));
                    ClasseDadosGravacao.listaFarmaceutico.set(codigo-1, farmaceutico);
                }
          
          
             utilities.Utilities.ativaDesativa(true, this.cadastroFarmaceutico.getjPanelBotoes());
             utilities.Utilities.limpaComponentes(false, this.cadastroFarmaceutico.getjPanelDados() );
           
        } else if (evento.getSource() == this.cadastroFarmaceutico.getjButtonBuscar()) {
           codigo = 0;
            BuscaFarmaceutico buscaFarmaceutico = new BuscaFarmaceutico(null, true);
            ControllerBuscaFarmaceutico controllerBuscaFarmaceutico = new ControllerBuscaFarmaceutico(buscaFarmaceutico);
            buscaFarmaceutico.setVisible(true);

            if (codigo != 0) {

                Farmaceutico farmaceutico = new Farmaceutico();
                farmaceutico = model.bo.ClasseDadosGravacao.listaFarmaceutico.get(codigo - 1);

                utilities.Utilities.ativaDesativa(true, this.cadastroFarmaceutico.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, this.cadastroFarmaceutico.getjPanelDados());
                
                this.cadastroFarmaceutico.getIdField().setText(farmaceutico.getId() + "");
                this.cadastroFarmaceutico.getjTextField1().setText(farmaceutico.getNome());
                this.cadastroFarmaceutico.getjTextField3().setText(farmaceutico.getNomeSocial());
                this.cadastroFarmaceutico.getjFormattedTextField2().setText(farmaceutico.getDataCadastro());
                this.cadastroFarmaceutico.getjFormattedTextField1().setText(farmaceutico.getCpfCnpj());
                this.cadastroFarmaceutico.getjFormattedTextField6().setText(farmaceutico.getRgInscricaoEstadual());
                this.cadastroFarmaceutico.getjComboBox3().setSelectedItem(farmaceutico.getSexo());
                this.cadastroFarmaceutico.getjTextField4().setText(farmaceutico.getEmail());
                this.cadastroFarmaceutico.getjFormattedTextField3().setText(farmaceutico.getFone1());
                this.cadastroFarmaceutico.getjFormattedTextField4().setText(farmaceutico.getFone2());
                this.cadastroFarmaceutico.getjTextField12().setText(farmaceutico.getCrf());
                this.cadastroFarmaceutico.getjFormattedTextField5().setText(farmaceutico.getCep());
                this.cadastroFarmaceutico.getjTextField2().setText(farmaceutico.getComplemento());
                this.cadastroFarmaceutico.getjTextField5().setText(farmaceutico.getLogin());
                this.cadastroFarmaceutico.getjPasswordField4().setText(farmaceutico.getSenha());
                this.cadastroFarmaceutico.getjPasswordField3().setText(farmaceutico.getSenha());

                this.cadastroFarmaceutico.getIdField().setEnabled(false);
                this.cadastroFarmaceutico.getjTextField1().requestFocus();

            }
      
           
           //JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaEnfermeiro.toString());
            
        } else if (evento.getSource() == this.cadastroFarmaceutico.getjButtonSair()) {
            this.cadastroFarmaceutico.dispose();
        }

    }

}