/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.util.Calendar;

public class MovimentoMedicamento {
    private int id;
    private Calendar dataHoraMovimento;
    private String tipoMovimento;
    private float qtdMedicamento;
    private String observacao;
    private String status;
    private ReceitaMedicamento receitaMedicamento;
    private Lote lote;
    private Prontuario prontuario;
    

    public MovimentoMedicamento() {
    }

    public MovimentoMedicamento(int id, Calendar dataHoraMovimento, String tipoMovimento, float qtdMedicamento, String observacao, String status, ReceitaMedicamento receitaMedicamento, Lote lote, Prontuario prontuario) {
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.tipoMovimento = tipoMovimento;
        this.qtdMedicamento = qtdMedicamento;
        this.observacao = observacao;
        this.status = status;
        this.receitaMedicamento = receitaMedicamento;
        this.lote = lote;
        this.prontuario = prontuario;
    }

    public Calendar getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(Calendar dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public float getQtdMedicamento() {
        return qtdMedicamento;
    }

    public void setQtdMedicamento(float qtdMedicamento) {
        this.qtdMedicamento = qtdMedicamento;
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

    public ReceitaMedicamento getReceitaMedicamento() {
        return receitaMedicamento;
    }

    public void setReceitaMedicamento(ReceitaMedicamento receitaMedicamento) {
        this.receitaMedicamento = receitaMedicamento;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    @Override
    public String toString() {
        return "MovimentoMedicamento{" + "id=" + id + ", dataHoraMovimento=" + dataHoraMovimento + ", tipoMovimento=" + tipoMovimento + ", qtdMedicamento=" + qtdMedicamento + ", observacao=" + observacao + ", status=" + status + ", receitaMedicamento=" + receitaMedicamento + ", lote=" + lote + ", prontuario=" + prontuario + '}';
    }
    
    
}
