package exercicios.lista2013.cap10.ex14;

public class Main {
    public static void main(String[] args) {
        ArrayDeFloats array = new ArrayDeFloats(2);
        
        array.soma(3.5f);
        array.setArray(new float[] {2.4f, 1.5f});
        for (int i = 0; i < array.getArray().length; i++) {
            System.out.println(array.getArray()[i]);
        }

    }
}
