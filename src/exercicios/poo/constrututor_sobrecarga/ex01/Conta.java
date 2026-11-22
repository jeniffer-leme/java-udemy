package exercicios.poo.constrututor_sobrecarga.ex01;

public class Conta {
    private final int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome) {
        this.numero = numero;
        setNome(nome);
    }

    public Conta(int numero, String nome, double saldo) {
        this(numero, nome);
        setSaldo(saldo);
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(double deposito) {
        this.saldo += deposito;
    }
    
    public void saque(double saque) {
        this.saldo -= saque + 5.0;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
                "\nNúmero: " + numero + 
                "\nSaldo: " + saldo + "\n";
    }
    
}
