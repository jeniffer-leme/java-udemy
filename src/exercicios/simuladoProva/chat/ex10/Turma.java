//INACABADO
package exercicios.simuladoProva.chat.ex10;

public class Turma {
    private Aluno aluno[];

    public Turma() {
        aluno = new Aluno[35];
    }
    
    public boolean matricular(String nome, String matricula, double mediaFinal) {
        for(int i = 0; i < aluno.length; i++) {
            if(aluno[i] == null) {
                aluno[i] = new Aluno(nome, matricula, mediaFinal);
                return true;
            }
        }
        return false;
    }
    
    
}
