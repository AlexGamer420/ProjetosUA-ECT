import java.util.Scanner;



public class P13
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int x1,y1,x2,y2,escala;
    double distancia,d;
        System.out.println("Indique o Fator de escala: ");
		escala = input.nextInt();        
			
				System.out.println("Indique o x da coordenada A: ");
				x1 = input.nextInt();
				System.out.println("Indique o y da coordenada A: ");
				y1 = input.nextInt();
				System.out.println("Indique o x da coordenada B: ");
				x2 = input.nextInt();
				System.out.println("Indique o y da coordenada B: ");
				y2 = input.nextInt();
					
    d = ((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    distancia= Math.sqrt(d);
    distancia= distancia* escala;
     System.out.printf("distancia = %8.4f\n ",distancia);
     
  }
}
