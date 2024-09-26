/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

public class Exame {
    private int id;
    private String tituloExame;
    private String tipoExame;
    private String status;

    public Exame() {
    }

    public Exame(int id, String tituloExame, String tipoExame, String status) {
        this.id = id;
        this.tituloExame = tituloExame;
        this.tipoExame = tipoExame;
        this.status = status;
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

    public String getTituloExame() {
        return tituloExame;
    }

    public void setTituloExame(String tituloExame) {
        this.tituloExame = tituloExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    @Override
    public String toString() {
        return "Exame{" + "id=" + id + ", tituloExame=" + tituloExame + ", tipoExame=" + tipoExame + ", status=" + status + '}';
    }
    
     
           
}
