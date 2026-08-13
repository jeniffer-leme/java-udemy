package aulas.xml;


import log.ExceptionLogTrack;


public class ExceptionTracked {
    public static void main(String[] args) {
        
        ExceptionLogTrack.getInstance().addLog( new Exception("Teste.") );
        
    }
}