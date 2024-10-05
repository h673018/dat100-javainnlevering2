package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
	    for (int[] rad : matrise) {
	        for (int element : rad) {
	            System.out.print(element + " "); 
	        }
	        System.out.println(); 
	    }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
	    StringBuilder sb = new StringBuilder();

	    for (int[] rad : matrise) {
	        for (int element : rad) {
	            sb.append(element).append(" "); 
	        }
	        sb.append("\n"); 
	    }

	    return sb.toString();
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
	    int[][] nyMatrise = new int[matrise.length][matrise[0].length]; 

	    for (int i = 0; i < matrise.length; i++) {
	        for (int j = 0; j < matrise[i].length; j++) {
	            nyMatrise[i][j] = matrise[i][j] * tall; 
	        }
	    }

	    return nyMatrise; 
	
	}

	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
	    if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
	        return false; 
	    }

	    for (int i = 0; i < mat1.length; i++) {
	        for (int j = 0; j < mat1[i].length; j++) {
	            if (mat1[i][j] != mat2[i][j]) {
	                return false; 
	            }
	        }
	    }

	    return true; 
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
