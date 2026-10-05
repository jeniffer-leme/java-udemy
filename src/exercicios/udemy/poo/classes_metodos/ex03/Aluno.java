package exercicios.udemy.poo.classes_metodos.ex03;

public class Aluno {
    public String nome;
    public double nota1, nota2, nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        setNome(nome);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public double Trimestre() {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    
    public double PassOrFailed() {
        if(Trimestre() > 6.0) {
            System.out.println("Parabéns, você foi APROVADO!");
            return 0.0;
        } else {
            System.out.print("Você foi REPROVADO! Faltam ");
            return 60 - Trimestre();
        }
    }

    @Override
    public String toString() {
        return "Nome " + nome + 
                "\nNota: " + nota1 +
                "\nNota: " + nota2 +
                "\nNota: " + nota3 + "\n";
    }

}
