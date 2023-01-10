// Esse arquivo irá conter métodos que implementam 
// conhecimentos relacionados ao estudo de matrizes (matemática)

// Checa se a ordem da matriz passada é válida
public static boolean isAMatrix(int m, int n) {
    if (m<0 || n<0) {
        System.out.println("Não é uma matriz, pois o número de linhas ou de colunas é negativo.");
    } else if (m==0 || n==0) {
        System.out.println("Não é uma matriz, pois um dos índices é nulo.");
    }
}

// Checa se as matrizes possuem a mesma ordem
public static boolean mesmaOrdem(double[][] A, double[][] B) {
    if (A.length == B.length) {
        for (int i=0; i<A.length; ++i) {
            if (A[i].length == B[i].length) {
                return true;
            } else {
                return false;
            }
        }
    } else {
        return false;
    }
} 

// Método que realiza a soma de duas matrizes
public static double[][] somaMatriz(double[][] A, double[][] B) {
    if (!mesmaOrdem(A, B)) {
        System.out.println("As matrizes não podem ser somadas, pois suas ordens diferem"
        return false;
    }

    double[A.length][A[0].length] C; // Declaração da matriz C, que recebe o produto AB 
    // (A[0].length foi utilizado pois esse código só executa após ser verificado que todas as linhas possuem o mesmo número de colunas)
    
    // Dadas as matrizes A = (a i,j)MxN e B = (b i,j)MxN, a soma A+B é 
    // representada pela matriz C = (c i,j)MxN, em que C i,j = A i,j + B i,j para todo i pertencente a {1, 2, ..., m} e j pertencente a {1, 2, ..., n}
    for (int i=0; i<A.length; ++i) { // Laço for para iterar sobre as linhas
        for (int j=0; j<B[i].length; ++j) {
            C[i][j] = A[i][j] + B[i][j]; 
        }
    }
}
