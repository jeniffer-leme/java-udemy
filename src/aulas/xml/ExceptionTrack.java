package aulas.xml;

import log.ExceptionLogTrack;

public class ExceptionTrack {
    public static void main(String[] args) {
        ExceptionLogTrack.getInstance().addLog(new Exception("Teste"));
    }
}
