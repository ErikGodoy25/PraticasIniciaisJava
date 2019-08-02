package br.com.praticas.inicial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColetandoEntradasUsuário {

	
	static void main (String[] args) throws IOException
	{
		String nomeAluno;
		
		System.out.println("Informe o nome do Aluno: ");
		
		InputStreamReader converter = 
				new InputStreamReader(System.in);
		
		BufferedReader entrada = new BufferedReader(converter);
		
		nomeAluno = entrada.readLine();
		
		System.out.println("O Nome informado: " + nomeAluno);
	}
}


