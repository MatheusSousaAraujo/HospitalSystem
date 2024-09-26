/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.util.Calendar;

public class Receita {
    private int id;
    private Calendar dataHoraReceita;
    private String observacao;
    private String status;
   
    public Receita() {
    }

    public Receita(int id, Calendar dataHoraReceita, String observacao, String status) {
        this.id = id;
        this.dataHoraReceita = dataHoraReceita;
        this.observacao = observacao;
        this.status = status;
    }

    public Calendar getDataHoraReceita() {
        return dataHoraReceita;
    }

    public void setDataHoraReceita(Calendar dataHoraReceita) {
        this.dataHoraReceita = dataHoraReceita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Receita{" + "id=" + id + ", dataHoraReceita=" + dataHoraReceita + ", observacao=" + observacao + ", status=" + status + '}';
    }
    
    
}
