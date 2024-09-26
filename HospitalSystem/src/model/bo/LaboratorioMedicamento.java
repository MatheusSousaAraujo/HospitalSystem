/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

public class LaboratorioMedicamento {
    private int id;
    private String codigoBarras;
    private String observacao;
    private String status;
    private Medicamento medicamento;
    private Laboratorio laboratorio;

    public LaboratorioMedicamento() {
    }

    public LaboratorioMedicamento(int id, String codigoBarras, String observacao, String status, Medicamento medicamento, Laboratorio laboratorio) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.observacao = observacao;
        this.status = status;
        this.medicamento = medicamento;
        this.laboratorio = laboratorio;
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

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String toString() {
        return "LaboratorioMedicamento{" + "id=" + id + ", codigoBarras=" + codigoBarras + ", observacao=" + observacao + ", status=" + status + ", medicamento=" + medicamento + ", laboratorio=" + laboratorio + '}';
    }
    
    
}
