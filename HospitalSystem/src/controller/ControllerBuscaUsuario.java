package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Usuario;
import view.BuscaUsuario;

public class ControllerBuscaUsuario implements ActionListener {

    BuscaUsuario buscaUsuario;

    public ControllerBuscaUsuario(BuscaUsuario buscaUsuario) {
        this.buscaUsuario = buscaUsuario;

        this.buscaUsuario.getjButtonCarregar().addActionListener(this);
        this.buscaUsuario.getjButtonSair().addActionListener(this);
        this.buscaUsuario.getjButtonFiltrar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.buscaUsuario.getjButtonCarregar()) {

            ControllerCadastroUsuario.codigo = (int) this.buscaUsuario.getjTableDados().
                    getValueAt(this.buscaUsuario.getjTableDados().getSelectedRow(), 0);

            this.buscaUsuario.dispose();

        } else if (evento.getSource() == this.buscaUsuario.getjButtonFiltrar()) {

            /*
           if(this.buscaUsuario.getjCBFiltro().getSelectedIndex() == 0){
           }else if(this.buscaUsuario.getjCBFiltro().getSelectedIndex() == 1){
           }else if(this.buscaUsuario.getjCBFiltro().getSelectedIndex() == 2){
           }else if(this.buscaUsuario.getjCBFiltro().getSelectedIndex() == 3){
           }
             */
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaUsuario.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Usuario objetoAtualDaLista : model.bo.ClasseDadosGravacao.listaUsuario) {
                tabela.addRow(new Object[]{objetoAtualDaLista.getId(), objetoAtualDaLista.getNome(),
                    objetoAtualDaLista.getFone1(), objetoAtualDaLista.getLogin()});
            }

        } else if (evento.getSource() == this.buscaUsuario.getjButtonSair()) {
            this.buscaUsuario.dispose();
        }
    }
}
