/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.util.Calendar;

public class Prontuario {
    private int id;
    private Calendar dataHoraVisita;
    private String descricaoVisita;
    private String observacao;
    private String status;
    private InternacaoLeito internacaoLeito;
    private Enfermeiro enfermeiro;
    private Medico medico;
    

    public Prontuario() {
    }

    public Prontuario(int id, Calendar dataHoraVisita, String descricaoVisita, String observacao, String status, InternacaoLeito internacaoLeito, Enfermeiro enfermeiro, Medico medico) {
        this.id = id;
        this.dataHoraVisita = dataHoraVisita;
        this.descricaoVisita = descricaoVisita;
        this.observacao = observacao;
        this.status = status;
        this.internacaoLeito = internacaoLeito;
        this.enfermeiro = enfermeiro;
        this.medico = medico;
    }

    public Calendar getDataHoraVisita() {
        return dataHoraVisita;
    }

    public void setDataHoraVisita(Calendar dataHoraVisita) {
        this.dataHoraVisita = dataHoraVisita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoVisita() {
        return descricaoVisita;
    }

    public void setDescricaoVisita(String descricaoVisita) {
        this.descricaoVisita = descricaoVisita;
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

    public InternacaoLeito getInternacaoLeito() {
        return internacaoLeito;
    }

    public void setInternacaoLeito(InternacaoLeito internacaoLeito) {
        this.internacaoLeito = internacaoLeito;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Prontuario{" + "id=" + id + ", dataHoraVisita=" + dataHoraVisita + ", descricaoVisita=" + descricaoVisita + ", observacao=" + observacao + ", status=" + status + ", internacaoLeito=" + internacaoLeito + ", enfermeiro=" + enfermeiro + ", medico=" + medico + '}';
    }
    
    
}
