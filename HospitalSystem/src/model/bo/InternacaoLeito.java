/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.util.Calendar;

public class InternacaoLeito {
    private int id;
    private Calendar dataHoraAlocacao;
    private Calendar datahoraDesocupacao;
    private String status;
    private Internacao internacao;
    private Acompanhante acompanhante;
    private Leito leito;
    

    public InternacaoLeito() {
    }

    public InternacaoLeito(int id, Calendar dataHoraAlocacao, Calendar datahoraDesocupacao, String status, Internacao internacao, Acompanhante acompanhante, Leito leito) {
        this.id = id;
        this.dataHoraAlocacao = dataHoraAlocacao;
        this.datahoraDesocupacao = datahoraDesocupacao;
        this.status = status;
        this.internacao = internacao;
        this.acompanhante = acompanhante;
        this.leito = leito;
    }
    public Calendar getDataHoraAlocacao() {
        return dataHoraAlocacao;
    }

    public void setDataHoraAlocacao(Calendar dataHoraAlocacao) {
        this.dataHoraAlocacao = dataHoraAlocacao;
    }

    public Calendar getDatahoraDesocupacao() {
        return datahoraDesocupacao;
    }

    public void setDatahoraDesocupacao(Calendar datahoraDesocupacao) {
        this.datahoraDesocupacao = datahoraDesocupacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Internacao getInternacao() {
        return internacao;
    }

    public void setInternacao(Internacao internacao) {
        this.internacao = internacao;
    }

    public Acompanhante getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(Acompanhante acompanhante) {
        this.acompanhante = acompanhante;
    }

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    @Override
    public String toString() {
        return "InternacaoLeito{" + "id=" + id + ", dataHoraAlocacao=" + dataHoraAlocacao + ", datahoraDesocupacao=" + datahoraDesocupacao + ", status=" + status + ", internacao=" + internacao + ", acompanhante=" + acompanhante + ", leito=" + leito + '}';
    }
    
    
}
