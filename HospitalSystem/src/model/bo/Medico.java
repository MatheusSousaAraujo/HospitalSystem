/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

public class Medico extends Pessoa {
    private String crm;
    private String senha;
    private String login;
    private String nomeSocial;
    

    public Medico() {
    }

    public Medico(String crm, String senha, String login, String nomeSocial) {
        this.crm = crm;
        this.senha = senha;
        this.login = login;
        this.nomeSocial = nomeSocial;
    }

    public Medico(String crm, String senha, String login, String nomeSocial, int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, String dataCadastro, String cep, String cidade, String bairro, String logradouro, String complemento, String sexo, String status) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, cep, cidade, bairro, logradouro, complemento, sexo, status);
        this.crm = crm;
        this.senha = senha;
        this.login = login;
        this.nomeSocial = nomeSocial;
    }

    
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    @Override
    public String toString() {
        return "Medico{"+ super.toString() + "crm=" + crm + ", senha=" + senha + ", login=" + login + ", nomeSocial=" + nomeSocial + '}';
    }
    
    
}
