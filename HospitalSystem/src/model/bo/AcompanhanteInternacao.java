package model.bo;

import java.util.Calendar;

public class AcompanhanteInternacao {
    private int idAcompanhanteInternacao;
    private Calendar dataSainda;
    private Calendar dataEntrada;
    private String observacao;
    private String status;
    private InternacaoLeito internacaoLeito;
    private Acompanhante acompanhante;

    public AcompanhanteInternacao() {
    }

    public AcompanhanteInternacao(int idAcompanhanteInternacao, Calendar dataSainda, Calendar dataEntrada, String observacao, String status, InternacaoLeito internacaoLeito, Acompanhante acompanhante) {
        this.idAcompanhanteInternacao = idAcompanhanteInternacao;
        this.dataSainda = dataSainda;
        this.dataEntrada = dataEntrada;
        this.observacao = observacao;
        this.status = status;
        this.internacaoLeito = internacaoLeito;
        this.acompanhante = acompanhante;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdAcompanhanteInternacao() {
        return idAcompanhanteInternacao;
    }

    public void setIdAcompanhanteInternacao(int idAcompanhanteInternacao) {
        this.idAcompanhanteInternacao = idAcompanhanteInternacao;
    }

    public Calendar getDataSainda() {
        return dataSainda;
    }

    public void setDataSainda(Calendar dataSainda) {
        this.dataSainda = dataSainda;
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public InternacaoLeito getInternacaoLeito() {
        return internacaoLeito;
    }

    public void setInternacaoLeito(InternacaoLeito internacaoLeito) {
        this.internacaoLeito = internacaoLeito;
    }

    public Acompanhante getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(Acompanhante acompanhante) {
        this.acompanhante = acompanhante;
    }

    @Override
    public String toString() {
        return "AcompanhanteInternacao{" + "idAcompanhanteInternacao=" + idAcompanhanteInternacao + ", dataSainda=" + dataSainda + ", dataEntrada=" + dataEntrada + ", observacao=" + observacao + ", status=" + status + ", internacaoLeito=" + internacaoLeito + ", acompanhante=" + acompanhante + '}';
    }
    
    
}
