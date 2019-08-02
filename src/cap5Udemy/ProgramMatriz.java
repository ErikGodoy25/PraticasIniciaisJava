package cap5Udemy;

import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas: ");
		int m = sc.nextInt();
		System.out.println("Digite o numero de Colunas: ");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe  x: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.print("Position : " + i + "," + j + ":");
					System.out.println();
					if(j > 0) {
						System.out.print("left: " + mat[i][j-1]);
						System.out.println();
					}
					if( i > 0) {
						System.out.print("Up: " + mat[i-1][j]);
						System.out.println();
					}
					if(j < mat[i].length-1) {
						System.out.print("Rigth: " + mat[i][j+1]);
						System.out.println();
					}
					if (i < mat.length-1) {
						System.out.print("Down: " + mat[i+1][j]);
						System.out.println();
					}
				}
			}
		}

		sc.close();
	}

}
