package exercicios.lista2013.cap02.ex20;

public class Livro {
    private String nome;
    private String autor;
    private int paginas;

    public Livro(String nome, String autor, int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public boolean muitasPaginas(){
        if(paginas > 300){
            return true;
        } else {
            return false;
        }
    }
}
