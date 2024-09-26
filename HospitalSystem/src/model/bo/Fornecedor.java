/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

public class Fornecedor extends Pessoa{
    private String nomeFantasia;
    private String contato;
    private String nomeProprietario;

    public Fornecedor() {
    }
    
    public Fornecedor(String nomeFantasia, String contato, String nomeProprietario, int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, String dataCadastro, String cep, String cidade, String bairro, String logradouro, String complemento, String sexo, String status) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, cep, cidade, bairro, logradouro, complemento, sexo, status);
        this.nomeFantasia = nomeFantasia;
        this.contato = contato;
        this.nomeProprietario = nomeProprietario;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Fornecedor{"+ super.toString() + "nomeFantasia=" + nomeFantasia + ", contato=" + contato + ", nomeProprietario=" + nomeProprietario + '}';
    }
    
    
    
}