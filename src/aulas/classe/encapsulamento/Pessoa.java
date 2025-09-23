package aulas.classe.encapsulamento;

public class Pessoa {
    
    private double altura;
    private char sexo;
    private double pesoIdeal;

    public Pessoa(double a, char s) {
        setSexo(s);
        setAltura(a);
    }
    
    
    
    //métodos obter são métodos de consulta
    public double getAltura(){
        return altura;
    }

    public char getSexo(){
        return sexo;
    }
    
    public double getPesoIdeal(){
        return pesoIdeal;
    }
    
    //métodos de modificação
    public void setAltura(double a){
        if(a > 0.0 && a < 2.50){
            altura = a;   
            setPesoIdeal();
        } else {
            throw new IllegalArgumentException("Altura > 0.0 && < 2.50");
        }
    }
    
    public void setSexo(char s){
        if(s == 'F' || s == 'F' || s == 'm' || s == 'M'){
            sexo = s;
        } else {
            throw new IllegalArgumentException("sexo em (f, F, m, M)");
        }
    }
    
    private void setPesoIdeal(){
        if(sexo == 'f' || sexo == 'F'){
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            if(sexo == 'm' || sexo == 'M'){
            pesoIdeal = 72.7 * altura - 58.0;
            } else {
                throw new IllegalArgumentException("sexo em (f, F, m, M)");
            }
        }
    }
    
    
    
}
