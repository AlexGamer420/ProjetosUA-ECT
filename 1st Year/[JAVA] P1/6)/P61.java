import java.util.Scanner;

public class P61
{
	public static void main(String[] args)
    {
	Scanner input = new Scanner (System.in);
		
		System.out.println("Insira o tamanho da lista ");
				int dim = input.nextInt();
				
		int numeros[] = new int[dim];			
			for(int i =0;i<numeros.length;i++)
			{
				System.out.println("Insira os valores");
				int y = input.nextInt();
				numeros[i] = y;
			}
				for(int i= numeros.length-1; i>=0;i--)
				{
					System.out.println(numeros[i]);
				}
     }		

}	 


