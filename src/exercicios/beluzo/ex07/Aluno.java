package exercicios.beluzo.ex07;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        setNome(nome);
        setIdade(idade);
        setCurso(curso);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso;
    }
}
