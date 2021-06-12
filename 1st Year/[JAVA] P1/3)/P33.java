import java.util.Scanner;

public class P33
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      
      int fact,n;
      
      System.out.print("Fatorial de:");
      n= input.nextInt();
	  fact=1;
      for (int i=1; i<=n; i++){
			fact=fact*i;
				
		
							
								}
		System.out.printf("%3d!=%d*%n",n,fact);		
    }
}
