package aulas.classe.basico;

public class Main {
    public static void main(String[] args) {
        
//  Criação de intâncias (objetos) da classe Pessoa
//  Variavél do tipo referência a objetos do tipo pessoa
        Pessoa maria = new Pessoa();
        Pessoa joao = new Pessoa(); 
//  Variáveis de instância (variáveis de objeto acessado por meio da variável maria);
        maria.altura = 1.65;
        maria.sexo = 'f';
//  Chamada de método de instância de objeto da classe Pessoa(objeto acessado por meio da variável maria
        maria.calcularPesoIdeal();
        System.out.println("Peso ideal do objeto acessado por meio da variavél Maria: " + maria.pesoIdeal);
        
        joao.altura = 1.80;
        joao.sexo = 'm';
        joao.calcularPesoIdeal();
        System.out.println("Peso ideal doideal do objeto acessado por meio da variavél João: " + joao.pesoIdeal);
        
                System.out.println("===============//===============");
                
//  Tipo primitivo X tipo referência
        int a, b, c;
        a = 2;
        b = 3;
        c = 2;
//  Tipos primitivos são tratados por valor
        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));
        
                System.out.println("===============//===============");
                
//  Tipos referência são tratados por referência a memória, e tudo o que não for tipo primitivo é tipo referência
            System.out.println("Maria == João: " + (maria == joao));
        
            Pessoa silva;
            silva = maria;
                     
            System.out.println("Maria == Silva: " + (maria == silva));
            
                System.out.println("===============//===============");
            
            silva.altura = 1.60;
            maria.calcularPesoIdeal();
            System.out.println("Peso ideal da Maria: " + maria.pesoIdeal);
            
                System.out.println("===============//===============");

            
            System.out.println("Peso ideal do objeto acessado por meio da variavél Maria: " + maria.pesoIdeal);
            System.out.println("Peso ideal do objeto acessado por meio da variavél Silva: " + silva.pesoIdeal);
                            
            System.out.println("===============//===============");
  
            Pessoa matheus = new Pessoa(1.71, 'm');
            System.out.println("Peso ideal do objeto acessado por meio da variavél Matheus: " + matheus.pesoIdeal);
            
//            quebrou a integridade do objeto acessado por meio da variável Matheus
            matheus.altura = 2.00;
            System.out.println("Peso ideal do objeto acessado por meio da variavél Matheus: " + matheus.altura);

            matheus.altura = -250.00;            
            System.out.println("Peso ideal do objeto acessado por meio da variavél Matheus: " + matheus.altura);
    }
}
