import java.util.Scanner;

public class P71 {
  static final Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) {
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    System.out.print("Começou às ");
    printHora(inicio);  // crie esta função!
    System.out.println(".");
    System.out.println("Quando termina?");
    fim = lerHora();  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
  }
	public static void	printHora (Hora hora1)
	{
		System.out.printf("%02d:%02d:%02d", hora1.h, hora1.m, hora1.s);
	}
	
	public static Hora lerHora()
	{
	
	Hora hora1 =new Hora();

	do
	{
		
	} while() ;
	
}
	class Hora {
	int h;
	int m;
	int s;
	
	}
}
/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/



