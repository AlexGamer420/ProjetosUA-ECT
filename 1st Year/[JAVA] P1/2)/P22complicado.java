import java.util.Scanner;

public class P22complicado
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);

		double a,b;
		int c;
		
		System.out.println("Indique o primeiro valor");
		a= input.nextDouble();
		System.out.println("Indique o segundo valor");
		b= input.nextDouble();

		c=(int)(a/b);
		System.out.printf ("c=%d\n", c);
		switch (c){ 
			
			case 1:  //(10/10) erro no (4/3)
			System.out.println("Os valores sao iguais");
			break;
			
			case 0:	 //(2/100)
			System.out.printf("O maior valor e= %8.4f\n", b);
			break;
			
			default: //(100/2) todos os numeros maiores que 1
			System.out.printf("O maior valor e= %8.f\n", a);
			
			case -1: //	(-4/3)	erro no -1
			System.out.println("Os valores sao iguais");
			break;
			}
		
	
	}
}
