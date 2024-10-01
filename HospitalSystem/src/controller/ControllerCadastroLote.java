
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.bo.ClasseDadosGravacao;
import model.bo.Lote;
import view.BuscaLote;
import view.CadastroLote;



public class ControllerCadastroLote implements ActionListener{
    
    CadastroLote cadastroLote;
    public static int codigo;

    public ControllerCadastroLote(CadastroLote cadastroLote) {
        this.cadastroLote = cadastroLote;
       
        this.cadastroLote.getjButtonNovo().addActionListener(this);
        this.cadastroLote.getjButtonCancelar().addActionListener(this);
        this.cadastroLote.getjButtonGravar().addActionListener(this);
        this.cadastroLote.getjButtonBuscar().addActionListener(this);
        this.cadastroLote.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(false, this.cadastroLote.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroLote.getjPanelDados());
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.cadastroLote.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroLote.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true,this.cadastroLote.getjPanelDados());
            
        this.cadastroLote.getIdField().setEnabled(false);

        } else if (evento.getSource() == this.cadastroLote.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroLote.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroLote.getjPanelDados() );

        } else if (evento.getSource() == this.cadastroLote.getjButtonGravar()) {

             Lote lote  = new Lote();
             
            lote.setId(model.bo.ClasseDadosGravacao.listaLote.size() + 1);
            lote.setStatus(this.cadastroLote.getjTextField7().getText());
            lote.setDataFabricacao(this.cadastroLote.getjFormattedTextField7().getText());
            lote.setDataValidade(this.cadastroLote.getjFormattedTextField8().getText());
            lote.setDescricao(this.cadastroLote.getjTextArea1().getText());
            
            
            
             utilities.Utilities.ativaDesativa(true, this.cadastroLote.getjPanelBotoes());
             utilities.Utilities.limpaComponentes(false, this.cadastroLote.getjPanelDados() );
           
        } else if (evento.getSource() == this.cadastroLote.getjButtonBuscar()) {
           codigo = 0;
            BuscaLote buscaLote = new BuscaLote(null, true);
            ControllerBuscaLote controllerBuscaLote = new ControllerBuscaLote(buscaLote);
            buscaLote.setVisible(true);

            if (codigo != 0) {

                Lote lote = new Lote();
                lote = model.bo.ClasseDadosGravacao.listaLote.get(codigo - 1);

                utilities.Utilities.ativaDesativa(true, this.cadastroLote.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, this.cadastroLote.getjPanelDados());

                this.cadastroLote.getIdField().setText(lote.getId() + "");
                this.cadastroLote.getjTextField7().setText(lote.getStatus());
                this.cadastroLote.getjFormattedTextField7().setText(lote.getDataFabricacao());
                this.cadastroLote.getjFormattedTextField8().setText(lote.getDataValidade());
                this.cadastroLote.getjTextArea1().setText(lote.getDescricao());

                this.cadastroLote.getIdField().setEnabled(false);
                this.cadastroLote.getjFormattedTextField7().requestFocus();

            }
      
           
           //JOptionPane.showMessageDialog(null, model.ClasseDadosGravacao.listaEnfermeiro.toString());
            
        } else if (evento.getSource() == this.cadastroLote.getjButtonSair()) {
            this.cadastroLote.dispose();
        }

    }

}