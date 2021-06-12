import java.util.Scanner;



public class P16
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
		//Leitura de dados fornecidos pelo utiizador
		double dia1,dia2,dia3,dia4,total;
		
		System.out.println("Indique o valor investido no primeiro dia em Portugal");
		dia1= input.nextDouble ();
		dia2= dia1*0.20+ dia1;
		dia3= dia2*0.20+ dia2;
		dia4= dia3*0.20+ dia3;	
			
		total= dia1+ dia2+ dia3+ dia4;			
		
		System.out.printf (" O valor investido nos 4 dias passados em Portugal = %8.2f\n",total);
			
			
			}
		
		
		
		
  }

