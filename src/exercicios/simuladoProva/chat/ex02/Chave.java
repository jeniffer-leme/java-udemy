package exercicios.simuladoProva.chat.ex02;

public class Chave implements Emprestavel {
    private String armario;
    private int quantidade;

//    Parâmetro 'int quantidade' inútil
//    public Chave(String armario, int quantidade) {
//        setArmario(armario);
//        setQuantidade(1);
//    }
    
    public Chave(String armario) {
        setArmario(armario);
        setQuantidade(1);
    }
    
    public String getArmario() {
        return armario;
    }

    public void setArmario(String armario) {
        if(armario.matches("[Aa]\\d+")) {
            this.armario = armario;
        } else {
            throw new IllegalArgumentException("Armário precisa iniciar com 'A' e ser seguido por uma sequêancia numérica");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade == 1) {
            this.quantidade = quantidade;
        } else {
            throw new IllegalArgumentException("É necessário ter uma chave");
        }
    }

    @Override
    public String getNomeObjeto() {
        return "Chave\n" +
                "Armário: " + getArmario() +
                "\nQuantidade disponível: " + getQuantidade();
    }

    @Override
    public boolean podeEmprestar() {
        if(getQuantidade() == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean emprestar() {
        if(podeEmprestar()) {
            setQuantidade(0);
            return true;
        }
        return false;
    }

    @Override
    public boolean devolver() {
        if(getQuantidade() == 0) {
            setQuantidade(1);
            return true;
        } else {
            return false;
        }
    }
    
    
}
