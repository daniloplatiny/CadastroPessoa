package com.example.danilo.cadastropessoa;

import java.io.Serializable;

/**
 * Created by Danilo on 04/06/2016.
 */
public class Pessoa implements Serializable{

    int idade;
    String telefone;
    String cpf;
    String rG;
    String nome;
    String sexo;
    String estadoCivil;


    public Pessoa(String nome, String RG, String cpf, String telefone, int idade, String sexo, String estadoCivil) {
        this.rG = RG;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getrG() {
        return rG;
    }

    public void setrG(String rG) {
        this.rG = rG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



}


