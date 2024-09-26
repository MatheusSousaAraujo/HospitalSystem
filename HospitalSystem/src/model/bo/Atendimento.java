/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.util.Calendar;

public class Atendimento {
    private int id;
    private Calendar dataHoraAtendimento;
    private String pressao;
    private String temperatura;
    private int bpm;
    private float oximetria;
    private String historicoDeDoencas;
    private String alergias;
    private String medicacoesEmUso;
    private String anamnese;
    private String tipoAtendimento;
    private String classificacao;
    private String observacao;
    private String status;
    private Paciente paciente;
    private Usuario usuario;
    private Enfermeiro enfermeiro;
    

    public Atendimento() {
    }

    public Atendimento(int id, Calendar dataHoraAtendimento, String pressao, String temperatura, int bpm, float oximetria, String historicoDeDoencas, String alergias, String medicacoesEmUso, String anamnese, String tipoAtendimento, String classificacao, String observacao, String status, Paciente paciente, Usuario usuario, Enfermeiro enfermeiro) {
        this.id = id;
        this.dataHoraAtendimento = dataHoraAtendimento;
        this.pressao = pressao;
        this.temperatura = temperatura;
        this.bpm = bpm;
        this.oximetria = oximetria;
        this.historicoDeDoencas = historicoDeDoencas;
        this.alergias = alergias;
        this.medicacoesEmUso = medicacoesEmUso;
        this.anamnese = anamnese;
        this.tipoAtendimento = tipoAtendimento;
        this.classificacao = classificacao;
        this.observacao = observacao;
        this.status = status;
        this.paciente = paciente;
        this.usuario = usuario;
        this.enfermeiro = enfermeiro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataHoraAtendimento() {
        return dataHoraAtendimento;
    }

    public void setDataHoraAtendimento(Calendar dataHoraAtendimento) {
        this.dataHoraAtendimento = dataHoraAtendimento;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public float getOximetria() {
        return oximetria;
    }

    public void setOximetria(float oximetria) {
        this.oximetria = oximetria;
    }

    public String getHistoricoDeDoencas() {
        return historicoDeDoencas;
    }

    public void setHistoricoDeDoencas(String historicoDeDoencas) {
        this.historicoDeDoencas = historicoDeDoencas;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicacoesEmUso() {
        return medicacoesEmUso;
    }

    public void setMedicacoesEmUso(String medicacoesEmUso) {
        this.medicacoesEmUso = medicacoesEmUso;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    @Override
    public String toString() {
        return "Atendimento{" + "id=" + id + ", dataHoraAtendimento=" + dataHoraAtendimento + ", pressao=" + pressao + ", temperatura=" + temperatura + ", bpm=" + bpm + ", oximetria=" + oximetria + ", historicoDeDoencas=" + historicoDeDoencas + ", alergias=" + alergias + ", medicacoesEmUso=" + medicacoesEmUso + ", anamnese=" + anamnese + ", tipoAtendimento=" + tipoAtendimento + ", classificacao=" + classificacao + ", observacao=" + observacao + ", status=" + status + ", paciente=" + paciente + ", usuario=" + usuario + ", enfermeiro=" + enfermeiro + '}';
    }
    
   
}