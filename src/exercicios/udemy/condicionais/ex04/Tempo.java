package exercicios.udemy.condicionais.ex04;

public class Tempo {
    int id;
    int horaInicial;
    int horaFinal;
    int duracao;

    public Tempo(int id, int horaInicial, int horaFinal) {
        setId(id);
        setHoraInicial(horaInicial);
        setHoraFinal(horaFinal);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
    
    public int getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(int horaInicial) {
        if(horaInicial > 0 && horaInicial <= 24) {
            this.horaInicial = horaInicial;
        }
        else {
            throw new IllegalArgumentException("O dia tem somente 24h.");
        }
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(int horaFinal) {
        if(horaFinal > 0 && horaFinal <= 24) {
            this.horaFinal = horaFinal;
        }
        else {
            throw new IllegalArgumentException("O dia tem somente 24h.");
        }
    }

    public int getDuracao() {
        if(horaInicial < horaFinal) {
            return horaFinal - horaInicial;
        } else {
            return (24 - horaInicial) + horaFinal;
        }
    }

    @Override
    public String toString() {
        return "ID: " + getId() + 
                "\nHora Inicial: " + getHoraInicial() +
                "\nHora Final: " + getHoraFinal() +
                "\nDuração: " + getDuracao() + "\n";
    }
}
