package exercicios.simuladoProva.ex14.ex02;

public abstract class MaterialBibliografico {
    private String localizacao;
    private String titulo;
    private String autores;
    private int edicao;
    private int ano;

    public MaterialBibliografico(String localizacao, String titulo, String autores, int edicao, int ano) {
        setLocalizacao(localizacao);
        setTitulo(titulo);
        setAutores(autores);
        setEdicao(edicao);
        setAno(ano);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        if(localizacao != null) {
            this.localizacao = localizacao;
        } else {
            throw new IllegalArgumentException("A localização não pode ser null");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("O título não pode ser null");
        }
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        if(autores != null) {
            this.autores = autores;
        } else {
            throw new IllegalArgumentException("Os autores não podem ser null");
        }
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        if(edicao > 0) {
            this.edicao = edicao;
        } else {
            throw new IllegalArgumentException("A edição não pode ser <= que 0");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0 && ano < 2026) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("O ano não pode ser negativo e maior que 2026");
        }
    }
    
    
}
