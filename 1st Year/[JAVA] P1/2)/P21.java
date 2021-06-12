import java.util.Scanner;

public class P21
{
    public static void main(String[] args)
    {
      Scanner ler = new Scanner(System.in);
      
      double TPG1,TPG2,EI,media;
      
      System.out.println("Indique o valor das notas de 0-20");
      System.out.println("De TPG1:");
      TPG1= ler.nextDouble();
      System.out.println("De TPG2:");
      TPG2= ler.nextDouble();
      System.out.println("De EI:");
      EI= ler.nextDouble();
      
      media=TPG1*0.2+ TPG2*0.3+ EI*0.5;
		  if(media>=9.5){
			  System.out.println("O aluno foi aprovado");
			  
			  }
		  else {
			  System.out.println("O aluno foi reprovado");
			  }
    }
}
