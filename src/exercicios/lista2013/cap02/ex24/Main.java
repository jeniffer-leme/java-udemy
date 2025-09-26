package exercicios.lista2013.cap02.ex24;

public class Main {
    public static void main(String[] args) {
        Data d1 = new Data(3, 2, 1999);
        Data d2 = new Data(4, 8, 2000);
     
        System.out.println("Data atual:");
        System.out.println("Dia: " + d1.getDia());
        System.out.println("Mes: " + d1.getMes());
        System.out.println("Ano: " + d1.getAno());
        
        System.out.println();
        
        System.out.println("Nova data:");
        d1.duplicarData(d2);
        System.out.println("Dia: " + d1.getDia());
        System.out.println("Mes: " + d1.getMes());
        System.out.println("Ano: " + d1.getAno());
    }
}
