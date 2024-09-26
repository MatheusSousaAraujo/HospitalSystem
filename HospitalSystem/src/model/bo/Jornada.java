/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.util.Date;

public class Jornada {
    private Date dataInicial;
    private Date dataFinal;
    private int cargaHoraria;
    private Medico medico;
    private Enfermeiro enfermeiro;
    private Farmaceutico farmaceutico;

    public Jornada() {
    }

    public Jornada(Date dataInicial, Date dataFinal, int cargaHoraria, Medico medico, Enfermeiro enfermeiro, Farmaceutico farmaceutico) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cargaHoraria = cargaHoraria;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.farmaceutico = farmaceutico;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Farmaceutico getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(Farmaceutico farmaceutico) {
        this.farmaceutico = farmaceutico;
    }

    @Override
    public String toString() {
        return "Jornada{" + "dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", cargaHoraria=" + cargaHoraria + ", medico=" + medico + ", enfermeiro=" + enfermeiro + ", farmaceutico=" + farmaceutico + '}';
    }
    
}
