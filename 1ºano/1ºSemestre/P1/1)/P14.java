import java.util.Scanner;



public class P14
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
		//Leitura de dados fornecidos pelo utilizador
		double A,B; 			 // Variaveis de entrada
		double C,angulo;	 	 // Variaveis de saida
		System.out.println ("Introduza o valor do primeiro cateto");
		A= input.nextInt();
		System.out.println ("Introduza o valor do segundo cateto");
		B=input.nextInt();

		//Calculos
		C= Math.sqrt(A*A+B*B);
		System.out.printf ("Hipotenusa = %8.8f\n", C);
		
		angulo= Math.acos(A/C);
		System.out.printf ("Angulo entre A e B= %8.8f\n", angulo);
  }
}
