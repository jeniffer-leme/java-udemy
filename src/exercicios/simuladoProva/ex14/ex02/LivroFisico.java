package exercicios.simuladoProva.ex14.ex02;

public class LivroFisico extends MaterialBibliografico implements Emprestavel{
    private int qtdLivro;
    private int maxEmretado = 4;
    private int emprestar;

    public LivroFisico(String localizacao, String titulo, String autores, int edicao, int ano) {
        super(localizacao, titulo, autores, edicao, ano);
        setQtdLivro(5);
    }

    public int getQtdLivro() {
        return qtdLivro;
    }

    public void setQtdLivro(int qtdLivro) {
        this.qtdLivro = qtdLivro;
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
        return "Livro \n" +
        "Localização: " + super.getLocalizacao() +
        "\nTítulo: " + super.getTitulo() +
        "\nAutores: " + super.getAutores() + 
        "\nEdição: " + super.getEdicao() +
        "\nAno: " + super.getAno() +
        "\nQuantidade disponível: " + getQtdLivro();
    }

    @Override
    public boolean emprestar() {
        if(getMaxEmretado() >= getEmprestar()) {
            setQtdLivro(getQtdLivro() - getEmprestar());
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
            setQtdLivro(getQtdLivro() + getEmprestar());
            return true;
        }
        return false;
    }
}
