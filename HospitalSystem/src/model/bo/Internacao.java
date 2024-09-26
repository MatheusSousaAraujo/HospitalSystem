/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.util.Calendar;

public class Internacao {
    private int id;
    private Calendar dataHoraInternacao;
    private Calendar dataHoraAlta;
    private String observacao;
    private String status;
    private Consulta consulta;

    public Internacao() {
    }

    public Internacao(int id, Calendar dataHoraInternacao, Calendar dataHoraAlta, String observacao, String status, Consulta consulta) {
        this.id = id;
        this.dataHoraInternacao = dataHoraInternacao;
        this.dataHoraAlta = dataHoraAlta;
        this.observacao = observacao;
        this.status = status;
        this.consulta = consulta;
    }

    

    public Calendar getDataHoraInternacao() {
        return dataHoraInternacao;
    }

    public void setDataHoraInternacao(Calendar dataHoraInternacao) {
        this.dataHoraInternacao = dataHoraInternacao;
    }

    public Calendar getDataHoraAlta() {
        return dataHoraAlta;
    }

    public void setDataHoraAlta(Calendar dataHoraAlta) {
        this.dataHoraAlta = dataHoraAlta;
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

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    @Override
    public String toString() {
        return "Internacao{" + "id=" + id + ", dataHoraInternacao=" + dataHoraInternacao + ", dataHoraAlta=" + dataHoraAlta + ", observacao=" + observacao + ", status=" + status + ", consulta=" + consulta + '}';
    }
    
}
