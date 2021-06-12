
/*
 * Exercício 11.4
 * Crie um programa que permita gerir a avaliação de uma turma de Programação I 
 * com um máximo 20 alunos. Para cada aluno deverá ser guardada a seguinte informação:  
 * Número mecanográfico - valor inteiro; 
 * Nome do aluno - texto livre; 
 * Notas de 3 testes – valores inteiros no intervalo [0 ... 20]; 
 * Nota final - valor real no intervalo [0,0 ... 20,0]. 
 * 
 * O programa deve funcionar de forma repetitiva com base num menu de 
 * opções que a seguir se apresenta:   
 *  Gestão de uma turma:   
 * 1 - Inserir informação da turma   
 * 2 - Mostrar informação de um aluno   
 * 3 - Alterar informação de um aluno   
 * 4 - Listar os alunos  
 * 5 - Listar os alunos ordenados por nota final   
 * 6 - Média das notas finais   
 * 7 - Melhor aluno   
 * 8 – Inserir pesos dos vários testes  
 * 9 - guardar dados do aluno num ficheiro 
 * 0 - Terminar o programa   
 * Opção?  
 * O programa deverá permitir as seguintes operações:  
 * 
 * 1)Introdução da informação associada aos alunos, terminando com a 
 * introdução do nº mec. 0. Toda a informação deverá ser pedida ao 
 * utilizador com a exceção da nota final que deverá ser calculada 
 * pelo programa de acordo com os pesos dos vários testes (opção 8). 
 * Nesta opção, a turma deve ser preenchida desde o início, ignorando 
 * os dados previamente introduzidos.  
 * 
 * 2)Mostrar informação sobre um aluno com base no nº mec., pedido ao 
 * utilizador. Deve informar o utilizador se o aluno não existir.  
 * 
 * 3)Alterar notas de um aluno cujo nº mec. é pedido ao utilizador. 
 * Se o aluno não existir, deve ser acrescentado à turma no caso de 
 * ainda não se encontrar preenchida.  
 * 
 * 4)Mostrar a informação sobre os alunos.  
 * ----
 * 5)Mostrar a informação sobre os alunos, ordenada por nota final.  
 * 
 * 6)Calcular e imprimir a média das notas finais da turma.  
 * 
 * 7)Mostrar ao utilizador a informação sobre o melhor aluno.  
 * ----
 * 8)Introduzir os pesos dos vários testes. 
 * 
 * 
 */
import java.util.Scanner;
import java.io.*;


public class P114EU
{
	
	public static void main (String[] args)
	 {
		Scanner input = new Scanner(System.in);
	System.out.printf("Gestão de uma turma: ");
	System.out.println();
	System.out.printf("1 - Inserir informacao da turma");
	System.out.println();
	System.out.printf("2 - Mostrar informacao de um aluno "); 
	System.out.println();
	System.out.printf("3 - Alterar informacao de um aluno ");
	System.out.println();
	System.out.printf("4 - Listar os alunos ");
	System.out.println();
	System.out.printf("5 - Listar os alunos ordenados por nota final");
	System.out.println();
	System.out.printf("6 - Media das notas finais");
	System.out.println();
	System.out.printf("7 - Melhor aluno ");
	System.out.println();
	System.out.printf("8 - Inserir pesos dos varios testes");  
	System.out.println();
	System.out.printf("9 - Guardar dados do aluno num ficheiro");
	System.out.println();
	System.out.printf("0 - Terminar o programa  ");
	System.out.println();
	System.out.printf("Opcao?");
	
	int opcao =input.nextInt();
	
	
	 }
	 
	 public static turma
	 
	 
}














