package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Enfermeiro;
import view.BuscaEnfermeiro;

public class ControllerBuscaEnfermeiro implements ActionListener {

    BuscaEnfermeiro buscaEnfermeiro;
    //a

    public ControllerBuscaEnfermeiro(BuscaEnfermeiro buscaEnfermeiro) {
        this.buscaEnfermeiro = buscaEnfermeiro;

        this.buscaEnfermeiro.getjButtonCarregar().addActionListener(this);
        this.buscaEnfermeiro.getjButtonSair().addActionListener(this);
        this.buscaEnfermeiro.getjButtonFiltrar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.buscaEnfermeiro.getjButtonCarregar()) {

            ControllerCadastroEnfermeiro.codigo = (int) this.buscaEnfermeiro.getjTableDados().
                    getValueAt(this.buscaEnfermeiro.getjTableDados().getSelectedRow(), 0);

            this.buscaEnfermeiro.dispose();

        } else if (evento.getSource() == this.buscaEnfermeiro.getjButtonFiltrar()) {

            /*
           if(this.buscaEnfermeiro.getjCBFiltro().getSelectedIndex() == 0){
           }else if(this.buscaEnfermeiro.getjCBFiltro().getSelectedIndex() == 1){
           }else if(this.buscaEnfermeiro.getjCBFiltro().getSelectedIndex() == 2){
           }else if(this.buscaEnfermeiro.getjCBFiltro().getSelectedIndex() == 3){
           }
             */
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaEnfermeiro.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Enfermeiro objetoAtualDaLista : model.bo.ClasseDadosGravacao.listaEnfermeiro) {
                tabela.addRow(new Object[]{objetoAtualDaLista.getId(), objetoAtualDaLista.getNome(),
                    objetoAtualDaLista.getFone1(), objetoAtualDaLista.getCre()});
            }

        } else if (evento.getSource() == this.buscaEnfermeiro.getjButtonSair()) {
            this.buscaEnfermeiro.dispose();
        }
    }
}
