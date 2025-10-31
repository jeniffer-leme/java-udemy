package aulas.polimorfismo.abstract_;

public class Main {
    public static void main(String[] args) {
        
        //uma variável do tipo superclasse pode acessar um objeto de subclasse, mas dispõe de acesso somente aos métodos definidos na superclasse
        Empregado emp1 = new Assalariado("Maria", "888.888.888-88", 2000.80);
        
        System.out.println(emp1.getNome());
        
        //salario não está dentro de Empregado
//      System.out.println(emp1.getSalario());
 
        Assalariado emp2;

        emp2 = (Assalariado) emp1;
    
        System.out.println(emp2.getSalario());
        
        System.out.println(emp1);
        System.out.println(emp2);
        
        Horista emp3 = new Horista("Caio", "444.444.444-44", 100.0);
        
        System.out.println(emp3);
        
        emp3.setHorasTrabalhadas(50);
        System.out.println(emp3);
        
        emp3.setHorasTrabalhadas(20);
        System.out.println(emp3);
        
        AssalariadoComissionado emp4 = new AssalariadoComissionado("Gustavo", "222.222.222-22", 2000.00);
        
        System.out.println(emp4);
        
        //meta é 1500.00 >>>>>> taxa 0 (não bateu a meta)
        emp4.setVendasRealizadas(1000);
        emp4.setTaxaComissao(0);
        System.out.println(emp4);
        
        //meta é 1500.00 >>>>>> taxa 20 (bateu a meta)
        emp4.setVendasRealizadas(2000);
        emp4.setTaxaComissao(20);
        System.out.println(emp4);
    }
}
