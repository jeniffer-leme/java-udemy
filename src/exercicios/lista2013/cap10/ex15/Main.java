package exercicios.lista2013.cap10.ex15;

public class Main {
    public static void main(String[] args) {
        ArrayDeFloats array = new ArrayDeFloats(2);
        
        
        
        array.setArray(new float[] {4.1f, 2.3f});
        
        for(int i = 0; i < array.getArray().length; i++) {
            System.out.println(array.total());
        }
    }
}
