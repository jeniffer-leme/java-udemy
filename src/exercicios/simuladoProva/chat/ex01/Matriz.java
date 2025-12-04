package exercicios.simuladoProva.chat.ex01;

public class Matriz {
    private double[][] matriz;
    private int tamanho;

    public Matriz(int tamanho, double valor) {
        setTamanho(tamanho);
        
        matriz = new double[tamanho][tamanho];
        
        if(valor != 0.0) {
            iniciarMatriz(valor);
        }
    }

    public Matriz(int tamanho) {
        this(tamanho, 0.0);
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        if(tamanho == 2 || tamanho == 3) {
            this.tamanho = tamanho;
        } else {
            throw new IllegalArgumentException("Tamanho da matriz é inválida!");
        }
    }
    
    public void iniciarMatriz(double valor) {
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                matriz[i][j] = valor;
            }
        }
    }
    
    public double getElementos(int l, int c) {
        if(c < 0 || c >= getTamanho() || l < 0 || l >= getTamanho()) {
            throw new IllegalArgumentException("Posição inválida!");
        } else {
            return matriz[l][c];
        }
    }
    
    public void setElementos(int l, int c, double valor) {
        if(c < 0 || c >= getTamanho() || l < 0 || l >= getTamanho()) {
            throw new IllegalArgumentException("Posição inválida!");
        } else {
            matriz[l][c] = valor;
        }
    }
    
    public void adicionar(double valor) {
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                matriz[i][j] += valor;
            }
        }
    }
    
    public void subtrair(double valor) {
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                matriz[i][j] -= valor;
            }
        }
    }
    
    public void dividir(double valor) {
        if(valor == 0) {
            throw new IllegalArgumentException("Não é possível dividir por 0");
        } else {
            for(int i = 0; i < getTamanho(); i++) {
                for(int j = 0; j < getTamanho(); j++) {
                    matriz[i][j] /= valor;
                }
            }
        }
    }
    
    public void multiplicar(double valor) {
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                matriz[i][j] *= valor;
            }
        }
    }
    
    public double getMaior() {
        double aux = matriz[0][0];
        
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                if(matriz[i][j] > aux) {
                    aux = matriz[i][j];
                }
            }
        }
        return aux;
    }
    
    public double getMenor() {
        double aux = matriz[0][0];
        
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                if(matriz[i][j] < aux) {
                    aux = matriz[i][j];
                }
            }
        }
        return aux;
    }
    
    public double getDeterminante() {
        double det;
        if(getTamanho() == 2) {
            det = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
        } else {
            det = (matriz[0][0] * matriz[1][1] * matriz[2][2])
                + (matriz[0][1] * matriz[1][2] * matriz[2][0])
                + (matriz[0][2] * matriz[1][0] * matriz[2][1])
                - (matriz[0][2] * matriz[1][1] * matriz[2][0])
                - (matriz[0][0] * matriz[1][2] * matriz[2][1])
                - (matriz[0][1] * matriz[1][0] * matriz[2][2]); 
        }
        return det;
    }

    @Override
    public String toString() {
        String texto = "";
        
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                texto += "[" + matriz[i][j] + "] \t";
            }
            texto += "\n";
        }
        return texto;
    }
}
