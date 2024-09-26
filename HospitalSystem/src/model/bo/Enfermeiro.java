/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

public class Enfermeiro extends Pessoa{
    private String cre;
    private String senha;
    private String login;
    private String nomeSocial;
  
    public Enfermeiro() {
    }

    public Enfermeiro(String cre, String senha, String login, String nomeSocial, int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, String dataCadastro, String cep, String cidade, String bairro, String logradouro, String complemento, String sexo, String status) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, cep, cidade, bairro, logradouro, complemento, sexo, status);
        this.cre = cre;
        this.senha = senha;
        this.login = login;
        this.nomeSocial = nomeSocial;
    }
    public String getCre() {
        return cre;
    }

    public void setCre(String cre) {
        this.cre = cre;
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
        return "Enfermeiro{"+ super.toString() + "cre=" + cre + ", senha=" + senha + ", login=" + login + ", nomeSocial=" + nomeSocial + '}';
    }
    

}
