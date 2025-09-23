package aulas.classe.encapsulamento;

public class Main {
    public static void main(String[] args) {
        Pessoa maria = new Pessoa(1.75, 'f');
        
        System.out.println("maria.obterAltura() " + maria.getAltura());
        
        System.out.println("maria.obterSexo() " + maria.getSexo());
        
        System.out.println("maria.obterPesoIdeal() " + maria.getPesoIdeal());
        
        
        
        double aux = maria.getAltura();
        aux = 2.5;
        
    
        maria.setAltura(1.61);
        System.out.println("maria.getAltura()" + maria.getAltura());
        System.out.println("maria.obterPesoIdeal() " + maria.getPesoIdeal());
        
/*Leva ao erro
* maria.alterarAltura(-2.55);
* System.out.println(maria.obterAltura());
*/
  
        
        
    
    
    
    }
    
}
