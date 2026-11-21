package aulas.classe.metodos.coercao;

public class Main {
    public static void main(String[] args) {
        
        //Variável do tipo primitivo double (com o valor da constante PI)
        double pi = Math.PI;
        System.out.println(pi); 
        
        //Variável de tipo primitivo inteiro
        int num;
        
        //coerção explícita de valor de um tipo primitivo double para um valor de tipo primitivo int com PERDA DE INFORMAÇÃO
        num = (int) pi;
        System.out.println(num);
        
        int resultado = Integer.max(2, 1);
        System.out.println(resultado);
        
        resultado = Integer.max(2, (int) Math.PI);
        System.out.println(resultado);
        
        
    }
}
