package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Medico;
import view.BuscaMedico;

public class ControllerBuscaMedico implements ActionListener {

    BuscaMedico buscaMedico;

    public ControllerBuscaMedico(BuscaMedico buscaMedico) {
        this.buscaMedico = buscaMedico;

        this.buscaMedico.getjButtonCarregar().addActionListener(this);
        this.buscaMedico.getjButtonSair().addActionListener(this);
        this.buscaMedico.getjButtonFiltrar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.buscaMedico.getjButtonCarregar()) {

            ControllerCadastroMedico.codigo = (int) this.buscaMedico.getjTableDados().
                    getValueAt(this.buscaMedico.getjTableDados().getSelectedRow(), 0);

            this.buscaMedico.dispose();

        } else if (evento.getSource() == this.buscaMedico.getjButtonFiltrar()) {

            /*
           if(this.buscaMedico.getjCBFiltro().getSelectedIndex() == 0){
           }else if(this.buscaMedico.getjCBFiltro().getSelectedIndex() == 1){
           }else if(this.buscaMedico.getjCBFiltro().getSelectedIndex() == 2){
           }else if(this.buscaMedico.getjCBFiltro().getSelectedIndex() == 3){
           }
             */
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaMedico.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Medico objetoAtualDaLista : model.bo.ClasseDadosGravacao.listaMedico) {
                tabela.addRow(new Object[]{objetoAtualDaLista.getId(), objetoAtualDaLista.getNome(),
                    objetoAtualDaLista.getFone1(), objetoAtualDaLista.getCrm()});
            }

        } else if (evento.getSource() == this.buscaMedico.getjButtonSair()) {
            this.buscaMedico.dispose();
        }
    }
}
