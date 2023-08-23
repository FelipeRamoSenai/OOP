package com.poo.poo.classes;

import java.util.Scanner;

public class Aluno {
    private String aluno;
    static int contador = 0001;
    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    private String dataNascimento;
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String dataNascimento) {
        this.setAluno(nome);
        this.setDataNascimento(dataNascimento);
        this.setMatricula(contador);
        contador++;


    }

    
}
