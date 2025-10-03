package aulas.string;

public class Main {
    public static void main(String[] args) {
        
        String nome = "Jeniffer";
        
        String str = "";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        
        str = " ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        
        System.out.println("------------------------------------");
        
        //compara espaços de memória
        System.out.println(nome == str);
        
        //comparação se faz com os métodos equals
        String nome2 = "jeniffer";
        System.out.println(nome.equalsIgnoreCase("jeniffer"));
        nome.equalsIgnoreCase(nome2);
        
        
        String str2;
        str2 = nome.toUpperCase();
        System.out.println(nome);
        System.out.println(str2);
        
        nome.toUpperCase();
        System.out.println(nome.toUpperCase());
        
        System.out.println("----------------------------");
        
        for(int indice = 0; indice < nome.length(); indice++){
            char caracter;
            caracter = nome.charAt(indice);
            System.out.println(caracter);
        }
        
    }
}
