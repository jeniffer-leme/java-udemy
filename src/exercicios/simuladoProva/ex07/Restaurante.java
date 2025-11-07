package exercicios.simuladoProva.ex07;

public class Restaurante {
    
    private String nome;
    private String endereco;
    private String cnpj;
    private int telefone;
    private Mesa mesa1, mesa2, mesa3, mesa4, mesa5, mesa6, mesa7, mesa8, mesa9, mesa10; 

    public Restaurante(String nome, String endereco, String cnpj, int telefone) {
        setNome(nome);
        setEndereco(endereco);
        setCnpj(cnpj);
        setTelefone(telefone);

        mesa1 = new Mesa(1);
        mesa2 = new Mesa(2);
        mesa3 = new Mesa(3);
        mesa4 = new Mesa(4);
        mesa5 = new Mesa(5);
        mesa6 = new Mesa(6);
        mesa7 = new Mesa(7);
        mesa8 = new Mesa(8);
        mesa9 = new Mesa(9);
        mesa10 = new Mesa(10);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
    
    public void acomodarPessoas(int numeroMesa, int qtdPessoas) {
        switch (numeroMesa) {
            case 1:
                mesa1.acomodarPessoas(qtdPessoas);
                break;
            case 2:
                mesa2.acomodarPessoas(qtdPessoas);
                break;
            case 3:
                mesa3.acomodarPessoas(qtdPessoas);
                break;
            case 4:
                mesa4.acomodarPessoas(qtdPessoas);
                break;
            case 5:
                mesa5.acomodarPessoas(qtdPessoas);
                break;
            case 6:
                mesa6.acomodarPessoas(qtdPessoas);
                break;
            case 7:
                mesa7.acomodarPessoas(qtdPessoas);
                break;
            case 8:
                mesa8.acomodarPessoas(qtdPessoas);
                break;
            case 9:
                mesa9.acomodarPessoas(qtdPessoas);
                break;
            case 10:
                mesa10.acomodarPessoas(qtdPessoas);
                break;
            default:
                System.out.println("Mesa inválida!");
        }
    }
    
    public void adicinarPedido(int numeroMesa, double valor) {
        
        switch (numeroMesa) {
            
            case 1:
                mesa1.adicionarPedido(valor);
                break;
                
            case 2:
                mesa2.adicionarPedido(valor);
                break;
                
            case 3:
                mesa3.adicionarPedido(valor);
                break;
                
            case 4: 
                mesa4.adicionarPedido(valor); 
                break;
            
            case 5: 
                mesa5.adicionarPedido(valor); 
                break;
            
            case 6: 
                mesa6.adicionarPedido(valor); 
                break;
            
            case 7: 
                mesa7.adicionarPedido(valor); 
                break;
            
            case 8: 
                mesa8.adicionarPedido(valor); 
                break;
            
            case 9: 
                mesa9.adicionarPedido(valor); 
                break;
            
            case 10: 
                mesa10.adicionarPedido(valor); 
                break;
            
            default: System.out.println("Mesa inválida!");    
                
        }
    }
        
        public void fecharConta(int numeroMesa) {
        switch (numeroMesa) {
            case 1:
                mesa1.fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 2:
                mesa2.fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 3:
                mesa3.fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 4:
                mesa4.fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 5:
                mesa5.fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 6:
                mesa6.fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 7:
                mesa7.fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 8:
                mesa8.fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 9:
                mesa9.fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 10:
                mesa10.fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            default:
                System.out.println("Mesa inválida!");
        }
    }
    
}

