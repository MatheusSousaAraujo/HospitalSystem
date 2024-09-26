
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.bo.ClasseDadosGravacao;
import model.bo.Usuario;
import view.BuscaUsuario;
import view.CadastroUsuario;



public class ControllerCadastroUsuario implements ActionListener{
    
    CadastroUsuario cadastroUsuario;
    public static int codigo;

    public ControllerCadastroUsuario(CadastroUsuario cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
       
        this.cadastroUsuario.getjButtonNovo().addActionListener(this);
        this.cadastroUsuario.getjButtonCancelar().addActionListener(this);
        this.cadastroUsuario.getjButtonGravar().addActionListener(this);
        this.cadastroUsuario.getjButtonBuscar().addActionListener(this);
        this.cadastroUsuario.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroUsuario.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroUsuario.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroUsuario.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroUsuario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroUsuario.getjPanelDados());
            
        this.cadastroUsuario.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroUsuario.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroUsuario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroUsuario.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroUsuario.getjButtonGravar()) {

             Usuario usuario  = new Usuario();
             
            usuario.setId(model.bo.ClasseDadosGravacao.listaUsuario.size() + 1);
            usuario.setNome(this.cadastroUsuario.getjTextField1().getText());
            usuario.setNomeSocial(this.cadastroUsuario.getjTextField3().getText());
            usuario.setDataCadastro(this.cadastroUsuario.getjFormattedTextField2().getText());
            usuario.setCpfCnpj(this.cadastroUsuario.getjFormattedTextField1().getText());
            usuario.setRgInscricaoEstadual(this.cadastroUsuario.getjFormattedTextField6().getText());
            usuario.setSexo(this.cadastroUsuario.getjComboBox3().getSelectedItem()+ "");
            usuario.setEmail(this.cadastroUsuario.getjTextField4().getText());
            usuario.setFone1(this.cadastroUsuario.getjFormattedTextField3().getText());
            usuario.setFone2(this.cadastroUsuario.getjFormattedTextField4().getText());
            usuario.setCep(this.cadastroUsuario.getjFormattedTextField5().getText());
            //usuario.setCidade(this.cadastroUsuario.getjFormattedTextField4().getText());
            //usuario.setBairro(this.cadastroUsuario.getjFormattedTextField4().getText());
            //usuario.setLogradouro(this.cadastroUsuario.getjFormattedTextField4().getText());
            usuario.setComplemento(this.cadastroUsuario.getjTextField2().getText());
            usuario.setLogin(this.cadastroUsuario.getjTextField5().getText());
            //usuario.setSenha(this.cadastroUsuario.getjPasswordField4().getText());
            //usuario.setSenha(this.cadastroUsuario.getjPasswordField3().getText());
            
            //problema no if abaixo, pois quando não passa na condição mesmo assim ele desativa os botões
          
          if (!this.cadastroUsuario.getjPasswordField3().getText().equals(this.cadastroUsuario.getjPasswordField4().getText())) {
                JOptionPane.showMessageDialog(null, "As senhas não correspondem.");
                return;
                
            } else if (this.cadastroUsuario.getjPasswordField3().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo de senha não pode estar vazio.");
                return;
                
            }else if (this.cadastroUsuario.getIdField().getText().equals("")) {
                    usuario.setId(model.bo.ClasseDadosGravacao.listaUsuario.size() + 1);
                    usuario.setSenha(this.cadastroUsuario.getjPasswordField3().getText());
                    ClasseDadosGravacao.listaUsuario.add(usuario);
                    
            } else {
                    usuario.setId(Integer.parseInt(this.cadastroUsuario.getIdField().getText()));
                    ClasseDadosGravacao.listaUsuario.set(codigo-1, usuario);
                
                }
          
          
             utilities.Utilities.ativaDesativa(true, this.cadastroUsuario.getjPanelBotoes());
             utilities.Utilities.limpaComponentes(false, this.cadastroUsuario.getjPanelDados() );
           
        } else if (evento.getSource() == this.cadastroUsuario.getjButtonBuscar()) {
           codigo = 0;
            BuscaUsuario buscaUsuario = new BuscaUsuario(null, true);
            ControllerBuscaUsuario controllerBuscaUsuario = new ControllerBuscaUsuario(buscaUsuario);
            buscaUsuario.setVisible(true);

            if (codigo != 0) {

                Usuario usuario = new Usuario();
                usuario = model.bo.ClasseDadosGravacao.listaUsuario.get(codigo - 1);

                utilities.Utilities.ativaDesativa(true, this.cadastroUsuario.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, this.cadastroUsuario.getjPanelDados());

                this.cadastroUsuario.getIdField().setText(usuario.getId() + "");
                this.cadastroUsuario.getjTextField1().setText(usuario.getNome());
                this.cadastroUsuario.getjFormattedTextField3().setText(usuario.getFone1());
                this.cadastroUsuario.getjTextField5().setText(usuario.getLogin());

                this.cadastroUsuario.getIdField().setEnabled(false);
                this.cadastroUsuario.getjTextField1().requestFocus();

            }
      
           
           //JOptionPane.showMessageDialog(null, model.bo.ClasseDadosGravacao.listaEnfermeiro.toString());
            
        } else if (evento.getSource() == this.cadastroUsuario.getjButtonSair()) {
            this.cadastroUsuario.dispose();
        }

    }

}