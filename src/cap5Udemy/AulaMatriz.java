package cap5Udemy;

import java.util.Scanner;

public class AulaMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Main Diagonal");

		for (int i = 0; i < n; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println("---------------------------");

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		System.out.print("-------------------------------");
		
		

		sc.close();

	}

}
