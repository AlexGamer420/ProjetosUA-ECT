import java.util.Scanner;

public class P18
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Letra: ");
    char letra = scan.next().charAt(0);    
    if (letra>=97 && letra<123) letra -= 32;   
    System.out.println(letra);			
			
			}
		
		
		
		
  }


