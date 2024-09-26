/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

public class Usuario extends Pessoa{
    private String login;
    private String senha;
    private String nomeSocial;

    public Usuario() {
    }

    public Usuario(String login, String senha, String nomeSocial) {
        this.login = login;
        this.senha = senha;
        this.nomeSocial = nomeSocial;
    }

    public Usuario(String login, String senha, String nomeSocial, int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, String dataCadastro, String cep, String cidade, String bairro, String logradouro, String complemento, String sexo, String status) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, cep, cidade, bairro, logradouro, complemento, sexo, status);
        this.login = login;
        this.senha = senha;
        this.nomeSocial = nomeSocial;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    @Override
    public String toString() {
        return "Usuario{"+ super.toString() + "login=" + login + ", senha=" + senha + ", nomeSocial=" + nomeSocial + '}';
    }
    
    
    
    
    
    
}
