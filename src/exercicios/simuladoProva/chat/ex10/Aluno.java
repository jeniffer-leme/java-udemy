package exercicios.simuladoProva.chat.ex10;

public class Aluno {
    private String nome;
    private String matricula;
    private double mediaFinal;

    public Aluno(String nome, String matricula, double mediaFinal) {
        setNome(nome);
        setMatricula(matricula);
        setMediaFinal(mediaFinal);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser null");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(matricula != null) {
            this.matricula = matricula;
        } else {
            throw new IllegalArgumentException("A matricula não pode ser null");
        }
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        if(mediaFinal >= 0) {
            this.mediaFinal = mediaFinal;
        } else {
            throw new IllegalArgumentException("A média final não pode ser < 0");
        }
    }
    
    
}
