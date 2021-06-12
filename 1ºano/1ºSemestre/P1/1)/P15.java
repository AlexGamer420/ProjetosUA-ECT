import java.util.Scanner;



public class P15
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
		//Leitura de dados fornecidos pelo utiizador
		double P,TP1,TP2,TP3,TP4,QA; 	//Dados de entrada
		int x;
		double notaFinal; 				//Dados de saida
		
		System.out.println("Se recorreu ao exame final press '0', caso contrario press '1'");
		x= input.nextInt();
		
		switch (x){
			case 0:
				System.out.println("Qual foi o valor do exame final de 0-20?");
				notaFinal= input.nextDouble();
				System.out.printf("Nota final= %2.3f\n", notaFinal);
				break;
			
			case 1:
				System.out.println("Indique o valor do teste pratico");
				P= input.nextDouble();
				
				System.out.println("Indique o valor do primeiro teste teorico-pratico");
				TP1= input.nextDouble();
				System.out.println("Indique o valor do segundo teste teorico-pratico");
				TP2= input.nextDouble();
				System.out.println("Indique o valor do terceiro teste teorico-pratico");
				TP3= input.nextDouble();
				System.out.println("Indique o valor do quarto teste teorico-pratico");
				TP4= input.nextDouble();
				System.out.println("Indique o valor da QA (Questoes do e.learning)");
				QA= input.nextDouble();
			
					notaFinal = P*0.25+ TP1 *0.10 + TP2 *0.10+ TP3 *0.10 + TP4 *0.35+ QA *0.10;
					System.out.printf("Nota final= %2.3f\n",notaFinal);
			break;
			
			default : 
					System.out.println("Numero invalido");

				
			}
		
		
		
		
  }
}
