package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Paciente;
import view.BuscaPaciente;

public class ControllerBuscaPaciente implements ActionListener {

    BuscaPaciente buscaPaciente;

    public ControllerBuscaPaciente(BuscaPaciente buscaPaciente) {
        this.buscaPaciente = buscaPaciente;

        this.buscaPaciente.getjButtonCarregar().addActionListener(this);
        this.buscaPaciente.getjButtonSair().addActionListener(this);
        this.buscaPaciente.getjButtonFiltrar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.buscaPaciente.getjButtonCarregar()) {

            ControllerCadastroPaciente.codigo = (int) this.buscaPaciente.getjTableDados().
                    getValueAt(this.buscaPaciente.getjTableDados().getSelectedRow(), 0);

            this.buscaPaciente.dispose();

        } else if (evento.getSource() == this.buscaPaciente.getjButtonFiltrar()) {

            /*
           if(this.buscaPaciente.getjCBFiltro().getSelectedIndex() == 0){
           }else if(this.buscaPaciente.getjCBFiltro().getSelectedIndex() == 1){
           }else if(this.buscaPaciente.getjCBFiltro().getSelectedIndex() == 2){
           }else if(this.buscaPaciente.getjCBFiltro().getSelectedIndex() == 3){
           }
             */
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaPaciente.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Paciente objetoAtualDaLista : model.bo.ClasseDadosGravacao.listaPaciente) {
                tabela.addRow(new Object[]{objetoAtualDaLista.getId(), objetoAtualDaLista.getNome(),
                    objetoAtualDaLista.getFone1(), objetoAtualDaLista.getCpfCnpj()});
            }

        } else if (evento.getSource() == this.buscaPaciente.getjButtonSair()) {
            this.buscaPaciente.dispose();
        }
    }
}
