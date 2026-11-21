package aulas.classe.basico;

//    Classe (categoria) TitleCase
public class Pessoa {
    
//    Atibutos da classe em camelCase
    public double altura;
    public char sexo;
    public double pesoIdeal;
    
/*    Construtor padrão (sem parâmetros) aloca espaço de memória para as variáveis de instância com seus valores padrão 
*    (0 para numérico, false para boolean e null para tipo referência
*    
*    Criado pela JVM se omitido
*    Pessoa(){
*     }
*/    
    
    Pessoa(){
    }
    
    Pessoa(double a, char s){
        altura = a;
        sexo = s;
        calcularPesoIdeal();
    }
    
//    Métodos (operações) camelCase
    void calcularPesoIdeal(){
//        Variável local, só existe dentro do contexto do método calcularPesoIdeal;
        double auxiliar;
        
        if(sexo == 'F' ||  sexo == 'f'){
            auxiliar = 62.1 * altura - 44.7;
        }else{
            auxiliar = 72.7 * altura - 58.0; 
        } 
            
    }
}
