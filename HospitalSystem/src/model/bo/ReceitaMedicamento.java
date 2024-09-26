/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

public class ReceitaMedicamento {
    private int id;
    private String prescricao;
    private String status;
    private Receita receita;
    private Medicamento medicamento;
    
    public ReceitaMedicamento() {
    }

    public ReceitaMedicamento(int id, String prescricao, String status, Receita receita, Medicamento medicamento) {
        this.id = id;
        this.prescricao = prescricao;
        this.status = status;
        this.receita = receita;
        this.medicamento = medicamento;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public String toString() {
        return "ReceitaMedicamento{" + "id=" + id + ", prescricao=" + prescricao + ", status=" + status + ", receita=" + receita + ", medicamento=" + medicamento + '}';
    }
    
    
    
    
}
