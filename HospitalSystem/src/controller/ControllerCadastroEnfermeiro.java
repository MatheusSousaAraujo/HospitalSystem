
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.bo.ClasseDadosGravacao;
import model.bo.Enfermeiro;
import view.BuscaEnfermeiro;
import view.CadastroEnfermeiro;



public class ControllerCadastroEnfermeiro implements ActionListener{
    
    CadastroEnfermeiro cadastroEnfermeiro;
    public static int codigo;

    public ControllerCadastroEnfermeiro(CadastroEnfermeiro cadastroEnfermeiro) {
        this.cadastroEnfermeiro = cadastroEnfermeiro;
       
        this.cadastroEnfermeiro.getjButtonNovo().addActionListener(this);
        this.cadastroEnfermeiro.getjButtonCancelar().addActionListener(this);
        this.cadastroEnfermeiro.getjButtonGravar().addActionListener(this);
        this.cadastroEnfermeiro.getjButtonBuscar().addActionListener(this);
        this.cadastroEnfermeiro.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroEnfermeiro.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroEnfermeiro.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroEnfermeiro.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroEnfermeiro.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroEnfermeiro.getjPanelDados());
            
        this.cadastroEnfermeiro.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroEnfermeiro.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroEnfermeiro.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroEnfermeiro.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroEnfermeiro.getjButtonGravar()) {

             Enfermeiro enfermeiro  = new Enfermeiro();
            
            enfermeiro.setId(model.bo.ClasseDadosGravacao.listaEnfermeiro.size() + 1);
            enfermeiro.setNome(this.cadastroEnfermeiro.getjTextField1().getText());
            enfermeiro.setNomeSocial(this.cadastroEnfermeiro.getjTextField3().getText());
            enfermeiro.setDataCadastro(this.cadastroEnfermeiro.getjFormattedTextField2().getText());
            enfermeiro.setCpfCnpj(this.cadastroEnfermeiro.getjFormattedTextField1().getText());
            enfermeiro.setRgInscricaoEstadual(this.cadastroEnfermeiro.getjFormattedTextField6().getText());
            enfermeiro.setSexo(this.cadastroEnfermeiro.getjComboBox3().getSelectedItem()+ "");
            enfermeiro.setEmail(this.cadastroEnfermeiro.getjTextField4().getText());
            enfermeiro.setFone1(this.cadastroEnfermeiro.getjFormattedTextField3().getText());
            enfermeiro.setFone2(this.cadastroEnfermeiro.getjFormattedTextField4().getText());
            enfermeiro.setCep(this.cadastroEnfermeiro.getjFormattedTextField5().getText());
            //enfermeiro.setCidade(this.cadastroEnfermeiro.getjFormattedTextField4().getText());
            //enfermeiro.setBairro(this.cadastroEnfermeiro.getjFormattedTextField4().getText());
            //enfermeiro.setLogradouro(this.cadastroEnfermeiro.getjFormattedTextField4().getText());
            enfermeiro.setComplemento(this.cadastroEnfermeiro.getjTextField2().getText());
            enfermeiro.setLogin(this.cadastroEnfermeiro.getjTextField5().getText());
            enfermeiro.setCre(this.cadastroEnfermeiro.getjTextField12().getText());
            //enfermeiro.setSenha(this.cadastroEnfermeiro.getjPasswordField4().getText());
            //enfermeiro.setSenha(this.cadastroEnfermeiro.getjPasswordField3().getText());
            
            //problema no if abaixo, pois quando não passa na condição mesmo assim ele desativa os botões
          
          if (!this.cadastroEnfermeiro.getjPasswordField3().getText().equals(this.cadastroEnfermeiro.getjPasswordField4().getText())) {
                JOptionPane.showMessageDialog(null, "As senhas não correspondem.");
                return;
                
            } else if (this.cadastroEnfermeiro.getjPasswordField3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo de senha não pode estar vazio.");
                return;
                
            }else if (this.cadastroEnfermeiro.getIdField().getText().equals("")) {
                    enfermeiro.setId(model.bo.ClasseDadosGravacao.listaEnfermeiro.size() + 1);
                    enfermeiro.setSenha(this.cadastroEnfermeiro.getjPasswordField3().getText());
                    ClasseDadosGravacao.listaEnfermeiro.add(enfermeiro);
                    
            } else {
                    enfermeiro.setId(Integer.parseInt(this.cadastroEnfermeiro.getIdField().getText()));
                    ClasseDadosGravacao.listaEnfermeiro.set(codigo-1, enfermeiro);
                
                }
          
          
             utilities.Utilities.ativaDesativa(true, this.cadastroEnfermeiro.getjPanelBotoes());
             utilities.Utilities.limpaComponentes(false, this.cadastroEnfermeiro.getjPanelDados() );
           
        } else if (evento.getSource() == this.cadastroEnfermeiro.getjButtonBuscar()) {
           codigo = 0;
            BuscaEnfermeiro buscaEnfermeiro = new BuscaEnfermeiro(null, true);
            ControllerBuscaEnfermeiro controllerBuscaEnfermeiro = new ControllerBuscaEnfermeiro(buscaEnfermeiro);
            buscaEnfermeiro.setVisible(true);

            if (codigo != 0) {

                Enfermeiro enfermeiro = new Enfermeiro();
                enfermeiro = model.bo.ClasseDadosGravacao.listaEnfermeiro.get(codigo - 1);

                utilities.Utilities.ativaDesativa(true, this.cadastroEnfermeiro.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, this.cadastroEnfermeiro.getjPanelDados());

                this.cadastroEnfermeiro.getIdField().setText(enfermeiro.getId() + "");
                this.cadastroEnfermeiro.getjTextField1().setText(enfermeiro.getNome());
                this.cadastroEnfermeiro.getjTextField3().setText(enfermeiro.getNomeSocial());
                this.cadastroEnfermeiro.getjFormattedTextField2().setText(enfermeiro.getDataCadastro());
                this.cadastroEnfermeiro.getjFormattedTextField1().setText(enfermeiro.getCpfCnpj());
                this.cadastroEnfermeiro.getjFormattedTextField6().setText(enfermeiro.getRgInscricaoEstadual());
                this.cadastroEnfermeiro.getjComboBox3().setSelectedItem(enfermeiro.getSexo());
                this.cadastroEnfermeiro.getjTextField4().setText(enfermeiro.getEmail());
                this.cadastroEnfermeiro.getjFormattedTextField3().setText(enfermeiro.getFone1());
                this.cadastroEnfermeiro.getjFormattedTextField4().setText(enfermeiro.getFone2());
                this.cadastroEnfermeiro.getjTextField12().setText(enfermeiro.getCre());
                this.cadastroEnfermeiro.getjFormattedTextField5().setText(enfermeiro.getCep());
                this.cadastroEnfermeiro.getjTextField2().setText(enfermeiro.getComplemento());
                this.cadastroEnfermeiro.getjTextField5().setText(enfermeiro.getLogin());
                this.cadastroEnfermeiro.getjPasswordField4().setText(enfermeiro.getSenha());
                this.cadastroEnfermeiro.getjPasswordField3().setText(enfermeiro.getSenha());

                this.cadastroEnfermeiro.getIdField().setEnabled(false);
                this.cadastroEnfermeiro.getjTextField1().requestFocus();

            }
      
           
           //JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaEnfermeiro.toString());
            
        } else if (evento.getSource() == this.cadastroEnfermeiro.getjButtonSair()) {
            this.cadastroEnfermeiro.dispose();
        }

    }

}