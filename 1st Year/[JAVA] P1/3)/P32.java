import java.util.Scanner;

public class P32
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      
      int nr;
      
      System.out.println("Procura fazer a tabuada de qual valor inteiro?");
      nr= input.nextInt();
      for( int i=1; i<=10; i++){
      System.out.printf("%2d X %2d = %3d\n", nr, i, nr*i);
								
								}
      
		
    }
}
