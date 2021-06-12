import java.util.Scanner;

public class P63
{
	public static void main(String[] args)
    {
		Scanner input = new Scanner (System.in);
	int count=0	;
	int option=0;
	int[] list = null;
	do{
		count++;
		printOptions();
		option =input.nextInt();
		if(option==1) list = readSequence();
		if(option==2) writeSequence(list);
		
		if(option==10) break;
		
		
		}
	while (count <50);
	}
	
	public static int[] readSequence() //define o array
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Tamanho do array: ");
		int tamanho = input.nextInt();
		System.out.println("Valores do array: ");
		int list []= new int [tamanho];
		for(int i=0;i<list.length; i++)
				{
				list[i]=input.nextInt();
				}
				return list;
	 }	
	public static void writeSequence(int [] list) //escrever array
	{
		if(list.length ==0 || list== null) return;
		for(int i:list) if (max<i
	}
		
		
	public static void printOptions()	
	 {		
	System.out.println("1 - Ler uma sequencia de numeros inteiros");
	System.out.println("2 - Escrever a sequencia");
	System.out.println("3 - Calcular o maximo da sequencia");
	System.out.println("4 - Calcular o minimo da sequencia");
	System.out.println("5 - Calcular a media da sequencia");
	System.out.println("6 - Detetar se e uma sequencia so constituida por numeros pares");
	System.out.println("10 - Terminar o programa");
	System.out.println("Opção ->");

	 }
}
