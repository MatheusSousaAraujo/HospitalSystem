/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.util.Calendar;

public class Consulta {
    private int id;
    private String responsavel;
    private Calendar dataHoraConsulta;
    private String anamnese;
    private String diagnostico;
    private String prescricao;
    private String observavao;
    private String status;
    private Atendimento atendimento;
    private Medico medico;
    

    public Consulta() {
    }

    public Consulta(int id, String responsavel, Calendar dataHoraConsulta, String anamnese, String diagnostico, String prescricao, String observavao, String status, Atendimento atendimento, Medico medico) {
        this.id = id;
        this.responsavel = responsavel;
        this.dataHoraConsulta = dataHoraConsulta;
        this.anamnese = anamnese;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.observavao = observavao;
        this.status = status;
        this.atendimento = atendimento;
        this.medico = medico;
    }

   

    public Calendar getDataHoraConsulta() {
        return dataHoraConsulta;
    }

    public void setDataHoraConsulta(Calendar dataHoraConsulta) {
        this.dataHoraConsulta = dataHoraConsulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public String getObservavao() {
        return observavao;
    }

    public void setObservavao(String observavao) {
        this.observavao = observavao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", responsavel=" + responsavel + ", dataHoraConsulta=" + dataHoraConsulta + ", anamnese=" + anamnese + ", diagnostico=" + diagnostico + ", prescricao=" + prescricao + ", observavao=" + observavao + ", status=" + status + ", atendimento=" + atendimento + ", medico=" + medico + '}';
    }
    

   
}
