/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.paw2.model;

import java.util.Objects;

/**
 *
 * @author DavidFrancisco
 */
public class Paciente  {
    
    private String nome;
    private String rg;
    private String cpf;
    private sexoType sexo;
    private Endereco endereco;
    private Contato contato;
    private int id;

   
    public Paciente(){
        
    }

    public Paciente(String nome, String rg, String cpf, sexoType sexo, Endereco endereco, Contato contato, int id) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.contato = contato;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public sexoType getSexo() {
        return sexo;
    }

    public void setSexo(sexoType sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     
   
}
     
    










