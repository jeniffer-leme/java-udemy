package aulas.associacao.composicao;

//Carro é o todo
public class Carro {
    
    //a Roda é a parte
    private Roda dianteiraEsquerda;
    private Roda dianteiraDireita;
    private Roda traseiraDireita;
    private Roda traseiraEsquerda;

    public Carro() {
        
        //os atributos da classe, que dão origem as variáveis de instância, do tipo referência (Classe) são inicializdas com null
        dianteiraEsquerda = new Roda(true);
        dianteiraDireita = new Roda(true);
        traseiraDireita = new Roda(true);
        traseiraEsquerda = new Roda(true);
    }
    
    public boolean verificarStatusRoda(){
            
            boolean resultado = true; 
            
            if(dianteiraEsquerda.isStatus() == false){
                System.out.println("Roda Dianteira Esquerda com problemas");
                resultado = false;
            }
            
            if(dianteiraDireita.isStatus() == false){
                System.out.println("Roda Dianteira Direita com problemas");
                resultado = false;
            }
            
            if(traseiraEsquerda.isStatus() == false){
                System.out.println("Roda Traseira Esquerda com problemas");
                resultado = false;
            }
            
            if(traseiraDireita.isStatus() == false){
                System.out.println("Roda Traseira Direita com problemas");
                resultado = false;
            }
            
            if(resultado == true){
                System.out.println("As rodas estão ok!");
            }
            
            return resultado;
            
        }

    public Roda getDianteiraEsquerda() {
        return dianteiraEsquerda;
    }

    private void setDianteiraEsquerda(Roda dianteiraEsquerda) {
        this.dianteiraEsquerda = dianteiraEsquerda;
    }
    
    
    
    
}
