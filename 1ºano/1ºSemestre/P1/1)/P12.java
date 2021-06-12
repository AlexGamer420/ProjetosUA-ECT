import java.util.Scanner;



public class P12
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int sec;     				 		// Variaveis de Entrada
    int min, h ; 						// Variaveis de Saída
    System.out.println("Enter amount of seconds: ");
    sec = input.nextInt();
	
		h = sec/3600;
		sec = sec % 3600;
		
		min = sec/60;
		sec = sec % 60;
		
		System.out.print( h + ":" + min + ":" + sec);
		System.out.print("\n");
    
  }
}
