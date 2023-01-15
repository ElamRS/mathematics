package geometryStudies;

// Esse arquivo irá conter métodos que implementam 
// conhecimentos relacionados ao estudo de matrizes (matemática)

// Checa se a ordem da matriz passada é válida
public class Matrizes {
	public static void main(String[] args) {
		// Código para rodar e testar o funcionamento dos métodos
		int m = 2; // Número de linhas
		int n = 2; // Número de colunas
		
		// Declaração das Matrizes
		double[][] A = {{1, 2}, {3, 4}};
		double[][] B = {{2, 2}, {2, 2}};
		
		exibirMatriz(matrizTransposta(A), m, n);
		
		/*
		 * A = | 1 2 |  ==> At = | 1 3 |
		 * 	   | 3 4 |			 | 2 4 |
		*/
	}
	
	public static boolean isAMatrix(int m, int n) {
	    if (m<0 || n<0) {
	        System.out.println("Não é uma matriz, pois o número de linhas ou de colunas é negativo.");
	        return false;
	    } else if (m==0 || n==0) {
	        System.out.println("Não é uma matriz, pois um dos índices é nulo.");
	        return false;
	    } else {
	    	return true;
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
	    }
	    return false;
	} 

	// Método que realiza a soma de duas matrizes
	public static double[][] somaMatriz(double[][] A, double[][] B) {
	    if (!mesmaOrdem(A, B)) { // Checa se as ordens são iguais
	        System.out.println("As matrizes não podem ser somadas, pois suas ordens diferem.");
	    }
	    
	    // Declara a matriz C, que representa o produto A*B
	    double[][] C = new double[A.length][A[0].length]; // Declaração da matriz C, que recebe o produto AB 
	    // (A[0].length foi utilizado pois esse código só executa após ser verificado que todas as linhas possuem o mesmo número de colunas)
	    
	    // Dadas as matrizes A = (a ij)MxN e B = (b ij)MxN, a soma A+B é 
	    // representada pela matriz C = (c ij)MxN, em que C ij = A ij + B ij para todo i pertencente a {1, 2, ..., m} e j pertencente a {1, 2, ..., n}
	    for (int i=0; i<A.length; ++i) {
	        for (int j=0; j<B[i].length; ++j) { 
	            C[i][j] = A[i][j] + B[i][j]; 
	        }
	    }

	    return C;
	}

	// Método que retorna a matriz transposta de A
	public static double[][] matrizTransposta(double[][] A) {
	    // Declaração da Matriz Transposta
	    double[][] At = new double[A[0].length][A.length]; // Matriz trasnposta de mesma ordem que A (Assumindo que a matriz passada tem mesmo número de colunas em cada linha)

	    // Dada uma matriz A = (A ij)m x n, a matriz transposta de A é a matriz At = (A' ji) n x m, tal que A' ji = A ij para todo i e todo j,
	    // isto é, o elemento de At na linha i e coluna j é igual ao elemento de A na linha j e coluna i.   

	    for (int i=0; i<At.length; ++i) {
	        for (int j=0; j<At[i].length; ++j) {
	            At[i][j] = A[j][i];
	        }
	    }

	    return At;
	}
	
	// Método para multiplicar duas matrizes
		public static double[][] multMatriz(double[][] A, double[][] B) {
			// Dadas as matrizes A e B, a matriz produto P existe se, e somente se, o número
			// de colunas de A for igual ao número de linhas de B, isto é, se A for possuir ordem (M x N) e B (N X P)
			
			double[][] P = new double[A.length][B[0].length]; 
			
			// Checa se o número de colunas de A é igual ao de linhas de B
			if (A[0].length == B.length) {
				
			}
			
			return P;
		}
	
	
	// Método para exibir as matrizes
	public static void exibirMatriz(double[][] A, int m, int n) {
		for (int i=0; i<m; ++i) { // itera sobre as linhas
			for (int j=0; j<n; ++j) { // itera sobre as colunas
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
