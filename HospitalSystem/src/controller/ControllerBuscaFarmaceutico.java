package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Farmaceutico;
import view.BuscaFarmaceutico;

public class ControllerBuscaFarmaceutico implements ActionListener {

    BuscaFarmaceutico buscaFarmaceutico;

    public ControllerBuscaFarmaceutico(BuscaFarmaceutico buscaFarmaceutico) {
        this.buscaFarmaceutico = buscaFarmaceutico;

        this.buscaFarmaceutico.getjButtonCarregar().addActionListener(this);
        this.buscaFarmaceutico.getjButtonSair().addActionListener(this);
        this.buscaFarmaceutico.getjButtonFiltrar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.buscaFarmaceutico.getjButtonCarregar()) {

            ControllerCadastroFarmaceutico.codigo = (int) this.buscaFarmaceutico.getjTableDados().
                    getValueAt(this.buscaFarmaceutico.getjTableDados().getSelectedRow(), 0);

            this.buscaFarmaceutico.dispose();

        } else if (evento.getSource() == this.buscaFarmaceutico.getjButtonFiltrar()) {

            /*
           if(this.buscaFarmaceutico.getjCBFiltro().getSelectedIndex() == 0){
           }else if(this.buscaFarmaceutico.getjCBFiltro().getSelectedIndex() == 1){
           }else if(this.buscaFarmaceutico.getjCBFiltro().getSelectedIndex() == 2){
           }else if(this.buscaFarmaceutico.getjCBFiltro().getSelectedIndex() == 3){
           }
             */
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaFarmaceutico.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Farmaceutico objetoAtualDaLista : model.bo.ClasseDadosGravacao.listaFarmaceutico) {
                tabela.addRow(new Object[]{objetoAtualDaLista.getId(), objetoAtualDaLista.getNome(),
                    objetoAtualDaLista.getFone1(), objetoAtualDaLista.getCrf()});
            }

        } else if (evento.getSource() == this.buscaFarmaceutico.getjButtonSair()) {
            this.buscaFarmaceutico.dispose();
        }
    }
}
