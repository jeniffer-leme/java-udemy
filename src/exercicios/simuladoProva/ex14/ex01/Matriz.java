package exercicios.simuladoProva.ex14.ex01;

public class Matriz {
    private double matriz[][];
    private int tamanho;

    public Matriz(int tamanho, double valorInicial) {
        if(tamanho != 2 && tamanho != 3) {
            throw new IllegalArgumentException("Matriz precisa ter tamanho 2x2 ou 3x3");
        } else {
            matriz = new double[tamanho][tamanho];
            for(int i = 0; i < tamanho; i++) {
                for(int j = 0; j < tamanho; j++) {
                    matriz[i][j] = valorInicial;
                }
            }
        }
    }

    public Matriz(int tamanho) {
        this(tamanho, 0.0);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public double acessarMatriz(int linha, int coluna) {
        if(linha < 0 || matriz.length <= linha || coluna < 0 || matriz[0].length <= coluna ) {
            throw new IllegalArgumentException("Índice fora dos limites da matriz");
        } else { 
            return matriz[linha][coluna];
        }
    }
    
    public void alterarMatriz(int linha, int coluna, double valor) {
        if(linha < 0 || linha >= matriz.length || coluna < 0 || coluna >= matriz[0].length) {
            throw new IllegalArgumentException("Índice fora dos limites da matriz");
        } else {
            matriz[linha][coluna] = valor;
        }
    }
    
    public void somaElementoMatriz(double valor) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j  < matriz[0].length; j++) {
                matriz[i][j] += valor;
            }
        }
    }
    
    public void subtrairElementoMatriz(double valor) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] -= valor;
            }
        }
    }
    
    public void dividirElementoMatriz(double valor) {
        if(valor == 0) {
            throw new IllegalArgumentException("Não é possível uma divisão por zero.");
        } else {
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] /= valor;
                }
            }
        }
    }
    
    public void multiplicarElementoMatriz(double valor) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] *= valor;
            }
        }
    }
    
    public double maiorNumero() {
        double temp = matriz[0][0];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] > temp) {
                    temp = matriz[i][j];
                }
            }
        }
        return temp;
    }
    
    public double menorNumero() {
        double temp = matriz[0][0];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] < temp){
                    temp = matriz[i][j];
                }
            }
        }
        return temp;
    }
    
    public double determinanteDaMatriz() {
        double det;
        
        if(getTamanho() == 2) {
            det = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
            
        } else if(matriz.length == 3) {
            det = matriz[0][0] * matriz[1][1] * matriz[2][2]
                + matriz[0][1] * matriz[1][2] * matriz[2][0]
                + matriz[0][2] * matriz[1][0] * matriz[2][1]
                - matriz[0][2] * matriz[1][1] * matriz[2][0]
                - matriz[0][0] * matriz[1][2] * matriz[2][1]
                - matriz[0][1] * matriz[1][0] * matriz[2][2];
        } else {
            throw new IllegalArgumentException("Tamanho da matriz é inválida!");
        }
        return det;
    }

    @Override
    public String toString() {
        String texto = "Matriz: \n";
        
        for(int i = 0; i < matriz.length; i++) {
            texto += "[";
            for(int j = 0; j < matriz[0].length; j++) {
                texto += matriz[i][j] + ", ";
            }
            texto += "]\n";
        }
        return texto;
    }
    
    
}

//det = (matriz[0][0]*(matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])) 
//                    - (matriz[0][1]*(matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]))
//                    + (matriz[0][2]*(matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]));