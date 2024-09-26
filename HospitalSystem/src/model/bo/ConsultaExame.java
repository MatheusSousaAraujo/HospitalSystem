/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.util.Calendar;

public class ConsultaExame {
    private int id;
    private Calendar dataHoraExame;
    private String analiseExame;
    private String imagemExame;
    private String status;
    private Consulta consulta;
    private Exame exame;
   
    public ConsultaExame() {
    }

    public ConsultaExame(int id, Calendar dataHoraExame, String analiseExame, String imagemExame, String status, Consulta consulta, Exame exame) {
        this.id = id;
        this.dataHoraExame = dataHoraExame;
        this.analiseExame = analiseExame;
        this.imagemExame = imagemExame;
        this.status = status;
        this.consulta = consulta;
        this.exame = exame;
    }

    
    public Calendar getDataHoraExame() {
        return dataHoraExame;
    }

    public void setDataHoraExame(Calendar dataHoraExame) {
        this.dataHoraExame = dataHoraExame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnaliseExame() {
        return analiseExame;
    }

    public void setAnaliseExame(String analiseExame) {
        this.analiseExame = analiseExame;
    }

    public String getImagemExame() {
        return imagemExame;
    }

    public void setImagemExame(String imagemExame) {
        this.imagemExame = imagemExame;
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

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    @Override
    public String toString() {
        return "ConsultaExame{" + "id=" + id + ", dataHoraExame=" + dataHoraExame + ", analiseExame=" + analiseExame + ", imagemExame=" + imagemExame + ", status=" + status + ", consulta=" + consulta + ", exame=" + exame + '}';
    }
    
}
