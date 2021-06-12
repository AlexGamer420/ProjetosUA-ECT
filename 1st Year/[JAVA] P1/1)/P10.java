/*  JAM, 26-set-2019
 *  comentários ... varias linhas de comentários
 *  Converte milhas para km
 */
import java.util.Scanner;

public class P10
{
    public static void main(String[] args)
    {
      Scanner ler = new Scanner(System.in);
       System.out.print("Graus em Celsius: ");
         double C = ler.nextDouble();
      
      C = 1.8 * C;

		double F;
      F = C +32 ;

      
      System.out.printf("Fahrenheit = %1.1f",F); 

    }
}
