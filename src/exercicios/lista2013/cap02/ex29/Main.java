package exercicios.lista2013.cap02.ex29;

public class Main {
    public static void main(String[] args) {
        
        ContaBancariaSimplificada c1 = new ContaBancariaSimplificada("Manuel", 13, false);
        
        System.out.println("Abrir conta:");
        c1.abreConta();
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Conta especial: " + c1.getEhEspecial());
    
        System.out.println();
        
        System.out.println("Fazer deposito");
        c1.depositarValor(70);
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Conta especial: " + c1.getEhEspecial());
        
        System.out.println();
        
        System.out.println("Retirar valor:");
        c1.retirarValor(35);
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Conta especial: " + c1.getEhEspecial());
        
        
        
        
    }
}
