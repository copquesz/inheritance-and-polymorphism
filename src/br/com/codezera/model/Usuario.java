package br.com.codezera.model;

import br.com.codezera.enumerated.Nivel;

import java.util.Date;

/**
 * @author Lucas Copque on 17/09/2021
 */
public class Usuario {

    private Long id;

    private Date dataCadastro;

    private String nome;

    private String email;

    private String senha;

    private Nivel nivel;

    /**
     * Construtores
     */
    public Usuario() {
        this.nivel = Nivel.DEFAULT;
    }

    public Usuario(Long id, String nome, String email, String senha, Nivel nivel) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivel = nivel;
    }

    /**
     * Get's e Set's
     * @return
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", dataCadastro=" + dataCadastro +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
