package exercicios.lista2013.cap10.ex11;

public class Main {
    public static void main(String[] args) {
        
        ArrayDeFloats array2 = new ArrayDeFloats(4);
        
        ArrayDeFloats array = new ArrayDeFloats(4, 3);
        
        
        System.out.println(array.tamanho());
        
        System.out.println(array.valor(4));
        
        array.modifica(2, 7);
        
        System.out.println(array.tamanho());
        
        System.out.println(array2.tamanho());
    }
}
