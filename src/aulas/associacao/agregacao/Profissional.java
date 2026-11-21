package aulas.associacao.agregacao;

public class Profissional {
    private Empresa firma;

    public Profissional() {
    }
    
    public void setEmpresa(Empresa firma) {
        this.firma = firma;
    }
    
    public void status(){
        if(firma == null){
            System.out.println("Está desempregado!");
        } else {
            System.out.println("Está empregado na empresa " + firma.getNome());
        }
    }
    
}
