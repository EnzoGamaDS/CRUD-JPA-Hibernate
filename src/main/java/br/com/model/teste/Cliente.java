package br.com.model.teste;

import javax.persistence.*;

@Entity
@Table(name="clientes")

public class Cliente {
    @Id
    @Column(name = "id_aluno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_aluno;

    @Column(name = "nome_aluno")
    private String nome_aluno;

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }
}
