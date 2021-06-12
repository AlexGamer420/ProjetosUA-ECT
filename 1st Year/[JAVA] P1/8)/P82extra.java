import java.util.Scanner;

public class P82extra {
  static final Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) 
  {
    Ponto2D pto;
    Ponto2D[]lista= new Ponto2D[100];
    int i=0;
    
    
    do{
		pto=lerPonto();
		lista[i]= pto;
		i++;
	
		
			
			
		}while (!(pto.x==0 && pto.y==0) && i<lista.length);
		System.out.println("Lista de pontos introduzidos: ");
		escreverLista(lista,i-1);								
	}
										
	public static void escreverLista (Ponto2D[] lista, int n)
	{
	{
	for(int i=0 ; i<n ; i++)
	{	
		P82.escreverPonto(lista [i]);
	}
	}
}
 

	
	
  
  
	public static void	escreverPonto (Ponto2D pto){
	{
		System.out.printf("%3.1f,%3.1f", pto.x, pto.y);
	}
}
	public static Ponto2D lerPonto(){
	
	Ponto2D pto=  new Ponto2D();
	System.out.println("Introduza um ponto: ");
	System.out.println("Coordenada x");
	pto.x = input.nextDouble();
	System.out.println("Coordenada y");
	pto.y= input.nextDouble();	
	return pto;	
	}
}
	class Ponto2D{
		double x,y;
	
	}
