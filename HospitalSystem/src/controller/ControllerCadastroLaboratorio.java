
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.bo.ClasseDadosGravacao;
import model.bo.Laboratorio;
import view.BuscaLaboratorio;
import view.CadastroLaboratorio;



public class ControllerCadastroLaboratorio implements ActionListener{
    
    CadastroLaboratorio cadastroLaboratorio;
    public static int codigo;

    public ControllerCadastroLaboratorio(CadastroLaboratorio cadastroLaboratorio) {
        this.cadastroLaboratorio = cadastroLaboratorio;
       
        this.cadastroLaboratorio.getjButtonNovo().addActionListener(this);
        this.cadastroLaboratorio.getjButtonCancelar().addActionListener(this);
        this.cadastroLaboratorio.getjButtonGravar().addActionListener(this);
        this.cadastroLaboratorio.getjButtonBuscar().addActionListener(this);
        this.cadastroLaboratorio.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroLaboratorio.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroLaboratorio.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroLaboratorio.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroLaboratorio.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroLaboratorio.getjPanelDados());
            
        this.cadastroLaboratorio.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroLaboratorio.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroLaboratorio.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroLaboratorio.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroLaboratorio.getjButtonGravar()) {

            Laboratorio laboratorio = new Laboratorio();
             
            laboratorio.setId(model.bo.ClasseDadosGravacao.listaLaboratorio.size() + 1);
            laboratorio.setNome(this.cadastroLaboratorio.getjTextField1().getText());
            laboratorio.setNomeFantasia(this.cadastroLaboratorio.getjTextField3().getText());
            laboratorio.setDataCadastro(this.cadastroLaboratorio.getjFormattedTextField2().getText());
            laboratorio.setCpfCnpj(this.cadastroLaboratorio.getjFormattedTextField1().getText());
            laboratorio.setRgInscricaoEstadual(this.cadastroLaboratorio.getjFormattedTextField6().getText());
            laboratorio.setSexo(this.cadastroLaboratorio.getjComboBox3().getSelectedItem()+ "");
            laboratorio.setEmail(this.cadastroLaboratorio.getjTextField4().getText());
            laboratorio.setFone1(this.cadastroLaboratorio.getjFormattedTextField3().getText());
            laboratorio.setFone2(this.cadastroLaboratorio.getjFormattedTextField4().getText());
            laboratorio.setNomeProprietario(this.cadastroLaboratorio.getjFormattedTextField5().getText());
            laboratorio.setContato(this.cadastroLaboratorio.getjFormattedTextField7().getText());
            laboratorio.setCep(this.cadastroLaboratorio.getjFormattedTextField5().getText());
            //laboratorio.setCidade(this.cadastroLaboratorio.getjFormattedTextField4().getText());
            //laboratorio.setBairro(this.cadastroLaboratorio.getjFormattedTextField4().getText());
            //laboratorio.setLogradouro(this.cadastroLaboratorio.getjFormattedTextField4().getText());
            laboratorio.setComplemento(this.cadastroLaboratorio.getjTextField2().getText());
            
            if (this.cadastroLaboratorio.getIdField().getText().equals("")) {
                    laboratorio.setId(model.bo.ClasseDadosGravacao.listaLaboratorio.size() + 1);
                    ClasseDadosGravacao.listaLaboratorio.add(laboratorio);
            } else {
                    laboratorio.setId(Integer.parseInt(this.cadastroLaboratorio.getIdField().getText()));
                    ClasseDadosGravacao.listaLaboratorio.set(codigo-1, laboratorio);
                }
          
          
             utilities.Utilities.ativaDesativa(true, this.cadastroLaboratorio.getjPanelBotoes());
             utilities.Utilities.limpaComponentes(false, this.cadastroLaboratorio.getjPanelDados() );
           
        } else if (evento.getSource() == this.cadastroLaboratorio.getjButtonBuscar()) {
           codigo = 0;
            BuscaLaboratorio buscaLaboratorio = new BuscaLaboratorio(null, true);
            ControllerBuscaLaboratorio controllerBuscaLaboratorio = new ControllerBuscaLaboratorio(buscaLaboratorio);
            buscaLaboratorio.setVisible(true);

            if (codigo != 0) {

                Laboratorio laboratorio = new Laboratorio();
                laboratorio = model.bo.ClasseDadosGravacao.listaLaboratorio.get(codigo - 1);

                utilities.Utilities.ativaDesativa(true, this.cadastroLaboratorio.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, this.cadastroLaboratorio.getjPanelDados());

                this.cadastroLaboratorio.getIdField().setText(laboratorio.getId() + "");
                this.cadastroLaboratorio.getjTextField1().setText(laboratorio.getNome());
                this.cadastroLaboratorio.getjFormattedTextField3().setText(laboratorio.getFone1());
                this.cadastroLaboratorio.getjTextField5().setText(laboratorio.getNomeProprietario());

                this.cadastroLaboratorio.getIdField().setEnabled(false);
                this.cadastroLaboratorio.getjTextField1().requestFocus();

            }
      
           
           //JOptionPane.showMessageDialog(null, model.ClasseDadosGravacao.listaEnfermeiro.toString());
            
        } else if (evento.getSource() == this.cadastroLaboratorio.getjButtonSair()) {
            this.cadastroLaboratorio.dispose();
        }

    }

}