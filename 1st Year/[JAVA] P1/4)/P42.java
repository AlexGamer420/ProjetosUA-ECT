import java.util.Scanner;

public class P42
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      
      double n=1,produto=1;
      
      while(n!=0){      
		System.out.println("Insira um valor") ;
		n= input.nextDouble();
		produto=produto*n ;
		  
		}
		
			System.out.printf("Produto= %d\n",produto);
      
      
      
      
    }
}
