import java.util.Scanner;

public class P62
{
	public static void main(String[] args)
    {
	Scanner input = new Scanner (System.in);
	
	System.out.println("AVISO: Os seguintes valores pedidos tem que ser inteiros positivos!");
		System.out.println();
	
	System.out.println("Tamanho da sequencia: ");
		int tamanho = input.nextInt();
		int numeros[] = new int [tamanho];
		
		
		for(int i=0;i<tamanho;i++)
		{
			System.out.println("Valores pertencentes a sequencia: ");
			int valorSequencia = input.nextInt();
			if(valorSequencia>=0)
			{
				numeros[i] = valorSequencia;		
			}
			else
			{
				System.out.println("ERRO: O valor tem que ser positivo e inteiro");
			}
		 }
				System.out.println("Sequencia:");
				for(int i=0;i<=numeros.length-1;i++)
				{
					System.out.println(numeros[i]);
				}
			
				
			
	}
}


