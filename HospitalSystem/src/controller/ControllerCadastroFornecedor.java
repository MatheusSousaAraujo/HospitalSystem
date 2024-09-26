
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.bo.ClasseDadosGravacao;
import model.bo.Fornecedor;
import view.BuscaFornecedor;
import view.CadastroFornecedor;



public class ControllerCadastroFornecedor implements ActionListener{
    
    CadastroFornecedor cadastroFornecedor;
    public static int codigo;

    public ControllerCadastroFornecedor(CadastroFornecedor cadastroFornecedor) {
        this.cadastroFornecedor = cadastroFornecedor;
       
        this.cadastroFornecedor.getjButtonNovo().addActionListener(this);
        this.cadastroFornecedor.getjButtonCancelar().addActionListener(this);
        this.cadastroFornecedor.getjButtonGravar().addActionListener(this);
        this.cadastroFornecedor.getjButtonBuscar().addActionListener(this);
        this.cadastroFornecedor.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroFornecedor.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroFornecedor.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroFornecedor.getjPanelDados());
            
        this.cadastroFornecedor.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroFornecedor.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroFornecedor.getjButtonGravar()) {

            Fornecedor fornecedor = new Fornecedor();
             
            fornecedor.setId(model.bo.ClasseDadosGravacao.listaFornecedor.size() + 1);
            fornecedor.setNome(this.cadastroFornecedor.getjTextField1().getText());
            fornecedor.setNomeFantasia(this.cadastroFornecedor.getjTextField3().getText());
            fornecedor.setDataCadastro(this.cadastroFornecedor.getjFormattedTextField2().getText());
            fornecedor.setCpfCnpj(this.cadastroFornecedor.getjFormattedTextField1().getText());
            fornecedor.setRgInscricaoEstadual(this.cadastroFornecedor.getjFormattedTextField6().getText());
            fornecedor.setSexo(this.cadastroFornecedor.getjComboBox3().getSelectedItem()+ "");
            fornecedor.setEmail(this.cadastroFornecedor.getjTextField4().getText());
            fornecedor.setFone1(this.cadastroFornecedor.getjFormattedTextField3().getText());
            fornecedor.setFone2(this.cadastroFornecedor.getjFormattedTextField4().getText());
            fornecedor.setNomeProprietario(this.cadastroFornecedor.getjFormattedTextField5().getText());
            fornecedor.setContato(this.cadastroFornecedor.getjFormattedTextField7().getText());
            fornecedor.setCep(this.cadastroFornecedor.getjFormattedTextField5().getText());
            //fornecedor.setCidade(this.cadastroFornecedor.getjFormattedTextField4().getText());
            //fornecedor.setBairro(this.cadastroFornecedor.getjFormattedTextField4().getText());
            //fornecedor.setLogradouro(this.cadastroFornecedor.getjFormattedTextField4().getText());
            fornecedor.setComplemento(this.cadastroFornecedor.getjTextField2().getText());
            
            if (this.cadastroFornecedor.getIdField().getText().equals("")) {
                    fornecedor.setId(model.bo.ClasseDadosGravacao.listaFornecedor.size() + 1);
                    ClasseDadosGravacao.listaFornecedor.add(fornecedor);
            } else {
                    fornecedor.setId(Integer.parseInt(this.cadastroFornecedor.getIdField().getText()));
                    ClasseDadosGravacao.listaFornecedor.set(codigo-1, fornecedor);
                }
          
          
             utilities.Utilities.ativaDesativa(true, this.cadastroFornecedor.getjPanelBotoes());
             utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getjPanelDados() );
           
        } else if (evento.getSource() == this.cadastroFornecedor.getjButtonBuscar()) {
           codigo = 0;
            BuscaFornecedor buscaFornecedor = new BuscaFornecedor(null, true);
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(buscaFornecedor);
            buscaFornecedor.setVisible(true);

            if (codigo != 0) {

                Fornecedor fornecedor = new Fornecedor();
                fornecedor = model.bo.ClasseDadosGravacao.listaFornecedor.get(codigo - 1);

                utilities.Utilities.ativaDesativa(true, this.cadastroFornecedor.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, this.cadastroFornecedor.getjPanelDados());

                this.cadastroFornecedor.getIdField().setText(fornecedor.getId() + "");
                this.cadastroFornecedor.getjTextField1().setText(fornecedor.getNome());
                this.cadastroFornecedor.getjFormattedTextField3().setText(fornecedor.getFone1());
                this.cadastroFornecedor.getjTextField5().setText(fornecedor.getNomeProprietario());

                this.cadastroFornecedor.getIdField().setEnabled(false);
                this.cadastroFornecedor.getjTextField1().requestFocus();

            }
      
           
           //JOptionPane.showMessageDialog(null, model.ClasseDadosGravacao.listaEnfermeiro.toString());
            
        } else if (evento.getSource() == this.cadastroFornecedor.getjButtonSair()) {
            this.cadastroFornecedor.dispose();
        }

    }

}