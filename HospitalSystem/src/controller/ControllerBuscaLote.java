package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Lote;
import view.BuscaLote;

public class ControllerBuscaLote implements ActionListener {

    BuscaLote buscaLote;

    public ControllerBuscaLote(BuscaLote buscaLote) {
        this.buscaLote = buscaLote;

        this.buscaLote.getjButtonCarregar().addActionListener(this);
        this.buscaLote.getjButtonSair().addActionListener(this);
        this.buscaLote.getjButtonFiltrar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.buscaLote.getjButtonCarregar()) {

            ControllerCadastroPaciente.codigo = (int) this.buscaLote.getjTableDados().
                    getValueAt(this.buscaLote.getjTableDados().getSelectedRow(), 0);

            this.buscaLote.dispose();

        } else if (evento.getSource() == this.buscaLote.getjButtonFiltrar()) {

            /*
           if(this.buscaLote.getjCBFiltro().getSelectedIndex() == 0){
           }else if(this.buscaLote.getjCBFiltro().getSelectedIndex() == 1){
           }else if(this.buscaLote.getjCBFiltro().getSelectedIndex() == 2){
           }else if(this.buscaLote.getjCBFiltro().getSelectedIndex() == 3){
           }
             */
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaLote.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Lote objetoAtualDaLista : model.bo.ClasseDadosGravacao.listaLote) {
                tabela.addRow(new Object[]{objetoAtualDaLista.getId(), objetoAtualDaLista.getDataFabricacao(),
                    objetoAtualDaLista.getDataValidade(), objetoAtualDaLista.getStatus()});
            }

        } else if (evento.getSource() == this.buscaLote.getjButtonSair()) {
            this.buscaLote.dispose();
        }
    }
}
