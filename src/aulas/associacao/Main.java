package aulas.associacao;

import aulas.associacao.agregacao.Empresa;
import aulas.associacao.agregacao.Profissional;
import aulas.associacao.composicao.*;
//import aulas.associacao.composicao.Carro;
//import aulas.associacao.composicao.Roda;

public class Main {
    public static void main(String[] args) {
        
        //4 objetos da classe roda estão associados a um objeto da classe Carro
        //associação por composição
        Carro mobi = new Carro();
        mobi.verificarStatusRoda();
        
        Carro ferrari = new Carro();
        ferrari.verificarStatusRoda();
        
        Roda roda = ferrari.getDianteiraEsquerda();
        roda.setStatus(false);
        
        //acesso dado fora do objeto da classe Carro a um objeto pertencente a mesma, relação por composição
        //getDianteiraEsquerda estar público permite a modificação do objeto da classe Roda pertencente a um objeto da classe Carro
        //o modificador de acesso ao método getDianteiraEsquerda depende da dinâmica do problema a ser resolvido
        boolean status = roda.isStatus();
        roda.setStatus(false);
        
        ferrari.verificarStatusRoda();
        
        System.out.println("--------------------------------------------------------");
        
        Empresa google = new Empresa("google");
        
        Profissional maria = new Profissional();
        
        //os objetos da classe Empresa e Profissional existem de forma independente
        
        maria.status();
        
        //o objeto da classe Profissional está associado ao objeto da classe Empresa
        //associação de agregação
        maria.setEmpresa(google);
        
        maria.status();
        
    }
    
}
