package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Laboratorio;
import view.BuscaLaboratorio;

public class ControllerBuscaLaboratorio implements ActionListener {

    BuscaLaboratorio buscaLaboratorio;

    public ControllerBuscaLaboratorio(BuscaLaboratorio buscaLaboratorio) {
        this.buscaLaboratorio = buscaLaboratorio;

        this.buscaLaboratorio.getjButtonCarregar().addActionListener(this);
        this.buscaLaboratorio.getjButtonSair().addActionListener(this);
        this.buscaLaboratorio.getjButtonFiltrar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.buscaLaboratorio.getjButtonCarregar()) {

            ControllerCadastroLaboratorio.codigo = (int) this.buscaLaboratorio.getjTableDados().
                    getValueAt(this.buscaLaboratorio.getjTableDados().getSelectedRow(), 0);

            this.buscaLaboratorio.dispose();

        } else if (evento.getSource() == this.buscaLaboratorio.getjButtonFiltrar()) {

            /*
           if(this.buscaLaboratorio.getjCBFiltro().getSelectedIndex() == 0){
           }else if(this.buscaLaboratorio.getjCBFiltro().getSelectedIndex() == 1){
           }else if(this.buscaLaboratorio.getjCBFiltro().getSelectedIndex() == 2){
           }else if(this.buscaLaboratorio.getjCBFiltro().getSelectedIndex() == 3){
           }
             */
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaLaboratorio.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Laboratorio objetoAtualDaLista : model.bo.ClasseDadosGravacao.listaLaboratorio) {
                tabela.addRow(new Object[]{objetoAtualDaLista.getId(), objetoAtualDaLista.getNome(),
                    objetoAtualDaLista.getFone1(), objetoAtualDaLista.getNomeProprietario()});
            }

        } else if (evento.getSource() == this.buscaLaboratorio.getjButtonSair()) {
            this.buscaLaboratorio.dispose();
        }
    }
}
