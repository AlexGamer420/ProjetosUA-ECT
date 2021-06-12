import java.util.Scanner;

public class P62help
{
	public static void main(String[] args)
    {
	Scanner input = new Scanner (System.in);
	
	System.out.println("AVISO: Os seguintes valores pedidos tem que ser inteiros positivos!");
		System.out.println();
	
		int tamanho =10;//trocar por 100
		int numeros[] = new int [tamanho];
		int i=0,x;
		do{
			System.out.print("Valor pertencente a sequencia: ");
			x = input.nextInt(); //x é um valor pertencente à sequencia
			
			numeros[i] = x;
			i++;
			} while (i < tamanho && x>=0);// repete a condição se x for inteiro positivo e houverem espaços vazios na sequencia
		
//LIXO DAQUI PA FRENTE
		 int valor;
		 i=0;
		 int cont=0;
		y=0
		 do{
			System.out.println("Valor a verificar: ");
			valor = input.nextInt();
			
			for(i=0;i<tamanho;i++
			
			int a = numeros[i] ;
				if(a == valor)
				{
					cont++;
				}
				i++;
				
			} while (iy=0<=100); // repete a condição 100 vezes se x for inteiro positivo 
			
		System.out.println("	
			
	}
}


