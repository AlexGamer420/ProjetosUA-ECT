import java.util.Scanner;



public class P17
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
		//Leitura de dados fornecidos pelo utiizador
		double desconto,precoInicial; 		//variaveis de entrada
		double precoFinal,iva;				//variaveis de saida
		
		System.out.println("Indique o valor do produto");
		precoInicial= input.nextDouble();
		
		System.out.println("Indique a percentagem do desconto");
		desconto= input.nextDouble();
		desconto= desconto/100;
		desconto= precoInicial*desconto;
		
		System.out.println("Indique a percentagem da taxa de iva ");
		iva= input.nextDouble();
		iva= iva/100;
		
		precoFinal= precoInicial-desconto;
		iva= precoFinal*iva;
		precoFinal=precoFinal+iva;
		System.out.printf("O valor a pagar = %8.2f\n", precoFinal);
		
			}
		
		
		
		
  }

