package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Fornecedor;
import view.BuscaFornecedor;

public class ControllerBuscaFornecedor implements ActionListener {

    BuscaFornecedor buscaFornecedor;

    public ControllerBuscaFornecedor(BuscaFornecedor buscaFornecedor) {
        this.buscaFornecedor = buscaFornecedor;

        this.buscaFornecedor.getjButtonCarregar().addActionListener(this);
        this.buscaFornecedor.getjButtonSair().addActionListener(this);
        this.buscaFornecedor.getjButtonFiltrar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.buscaFornecedor.getjButtonCarregar()) {

            ControllerCadastroFornecedor.codigo = (int) this.buscaFornecedor.getjTableDados().
                    getValueAt(this.buscaFornecedor.getjTableDados().getSelectedRow(), 0);

            this.buscaFornecedor.dispose();

        } else if (evento.getSource() == this.buscaFornecedor.getjButtonFiltrar()) {

            /*
           if(this.buscaFornecedor.getjCBFiltro().getSelectedIndex() == 0){
           }else if(this.buscaFornecedor.getjCBFiltro().getSelectedIndex() == 1){
           }else if(this.buscaFornecedor.getjCBFiltro().getSelectedIndex() == 2){
           }else if(this.buscaFornecedor.getjCBFiltro().getSelectedIndex() == 3){
           }
             */
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaFornecedor.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Fornecedor objetoAtualDaLista : model.bo.ClasseDadosGravacao.listaFornecedor) {
                tabela.addRow(new Object[]{objetoAtualDaLista.getId(), objetoAtualDaLista.getNome(),
                    objetoAtualDaLista.getFone1(), objetoAtualDaLista.getNomeProprietario()});
            }

        } else if (evento.getSource() == this.buscaFornecedor.getjButtonSair()) {
            this.buscaFornecedor.dispose();
        }
    }
}
