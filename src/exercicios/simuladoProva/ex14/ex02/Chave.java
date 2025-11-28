package exercicios.simuladoProva.ex14.ex02;

public class Chave implements Emprestavel {
    private String armario;
    private int qtdChave;
    private int emprestar;

    public Chave(String armario, int qtdChave) {
        setArmario(armario);
        setQtdChave(qtdChave);
    }
    
    public String getArmario() {
        return armario;
    }

    public void setArmario(String armario) {
        if(armario.matches("[Aa]\\d+")) {
            this.armario = armario;
        } else {
            throw new IllegalArgumentException("O armário não começa com a letra 'A' e/ou não é seguido por números.");
        }
    }

    public int getQtdChave() {
        return qtdChave;
    }

    public void setQtdChave(int qtdChave) {
        this.qtdChave = qtdChave;
    }
    
    public int getEmprestar() {
        return emprestar;
    }

    public void setEmprestar(int emprestar) {
        this.emprestar = emprestar;
    }
    
    @Override
    public String getNomeObjeto() {
        return "Chave\n" + 
                "Armário: " + getArmario() +
                "\nQuantidade de chaves: " + getQtdChave();
    }

    @Override
    public boolean emprestar() {
        if(getQtdChave() == getEmprestar()) {
            setQtdChave(getQtdChave() - getEmprestar());
            return true;
        } 
            return false;
    }

    @Override
    public boolean podeEmprestar() {
        if(getQtdChave() == getEmprestar()) {
            return true;
        } 
            return false;
    }

    @Override
    public boolean devolver() {
        if(getEmprestar() > 0) {
            setQtdChave(getQtdChave() + getEmprestar());
            return true;
        } 
            return false;
    }
    
}
