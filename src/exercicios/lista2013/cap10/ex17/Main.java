package exercicios.lista2013.cap10.ex17;

public class Main {
    public static void main(String[] args) {
        ArrayDeFloats array = new ArrayDeFloats(2);
        
        array.setArray(new float[] {3.2f, 4.1f});
        
            System.out.println(array.existe(2.2f));
        
    }
}
