package com.fundecc.gerenciamentousuario.entity;

import com.fundecc.gerenciamentousuario.model.Sexo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Usuario extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cpf;
    private Date dataNascimento;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @ManyToOne
    @JoinColumn(name = "idCargo", nullable = false)
    private Cargos cargo;

    @ManyToOne
    @JoinColumn(name = "idPerfil", nullable = true)
    private Perfis perfil;

    private Date dataCadastro;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public Date getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public Perfis getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfis perfil) {
        this.perfil = perfil;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
