package exercicios.simuladoProva.ex14.ex02;

public class Revista extends MaterialBibliografico implements Emprestavel{
    private int qtdRevista;
    private int maxEmretado = 2;
    private int emprestar;

    public Revista(String localizacao, String titulo, String autores, int edicao, int ano) {
        super(localizacao, titulo, autores, edicao, ano);
        setQtdRevista(3);
    }

    public int getQtdRevista() {
        return qtdRevista;
    }

    public void setQtdRevista(int qtdRevista) {
        this.qtdRevista = qtdRevista;
    }
    
    public int getMaxEmretado() {
        return maxEmretado;
    }

    public void setMaxEmretado(int maxEmretado) {
        this.maxEmretado = maxEmretado;
    }

    public int getEmprestar() {
        return emprestar;
    }

    public void setEmprestar(int emprestar) {
        this.emprestar = emprestar;
    }
    
    @Override
    public String getNomeObjeto() {
        return "Revista \n" +
        "Localização: " + super.getLocalizacao() +
        "\nTítulo: " + super.getTitulo() +
        "\nAutores: " + super.getAutores() + 
        "\nEdição: " + super.getEdicao() +
        "\nAno: " + super.getAno() +
        "\nQuantidade disponível: " + getQtdRevista();
    }

    @Override
    public boolean emprestar() {
        if(getMaxEmretado() >= getEmprestar()) {
            setQtdRevista(getQtdRevista() - getEmprestar());
            return true;
        }
        return false;
    }

    @Override
    public boolean podeEmprestar() {
        if(getMaxEmretado() >= getEmprestar()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean devolver() {
        if(getEmprestar() > 0) {
            setQtdRevista(getQtdRevista() + getEmprestar());
            return true;
        }
        return false;
    } 
}
