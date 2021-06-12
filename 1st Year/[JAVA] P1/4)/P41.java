import java.util.Scanner;

public class P41
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      
      int n,qnt=0;
	  
	  do
	  {
      System.out.println("Insira um valor");
      n= input.nextInt();
      qnt++;
      
      }while (n<=0);
      
			System.out.printf("Valor %d lido na %d vez e positivo\n",n,qnt);
    
    }
}
