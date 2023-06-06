package com.fundecc.gerenciamentousuario.entity;

import com.fundecc.gerenciamentousuario.model.Sexo;

import java.util.Date;

public abstract class Pessoa {
    long id;
    String nome;
    String cpf;
    Date dataNascimento;
    Sexo sexo;

    abstract long getId();

    abstract String getNome();

    abstract void setNome(String nome);

    abstract String getCpf();

    abstract void setCpf(String cpf);

    abstract Date getDataNascimento();

    abstract void setDataNascimento(Date dataNascimento);

    abstract Sexo getSexo();

    abstract void setSexo(Sexo sexo);
}
