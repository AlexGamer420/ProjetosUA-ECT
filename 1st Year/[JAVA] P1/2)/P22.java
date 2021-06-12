import java.util.Scanner;

public class P22
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);

		double a,b;
		
		System.out.println("Indique o primeiro valor");
		a= input.nextDouble();
		System.out.println("Indique o segundo valor");
		b= input.nextDouble();


		if(a>b){
			
		System.out.printf ("Maior valor= %8.4f\n",a);

			}
		else{
				if(a<b){
				System.out.printf("Maior valor= %8.4f\n",b);
						}
				else{
				System.out.printf("Os valores sao iguais");
					}
			}	
	}
}
