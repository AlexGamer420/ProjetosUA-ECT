import java.util.Scanner;

public class P82 {
  static final Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    Ponto2D pto;
    Ponto2D o = new Ponto2D();//por defeito fica o.x = 0 e o.y=0
    Ponto2D Pmax = new Ponto2D();
    int cont=0;
    double d,dmax=0,s=0;
    
    do{
			pto= lerPonto();
			d= distancia(pto,o);
			if (d>dmax)
				{
				dmax=d;
				Pmax=pto;
			}
			
			if(!(pto.x==0 && pto.y==0)) cont++;
			s+=d;
  }while (!(pto.x==0 && pto.y==0));
	System.out.printf("A soma das distancias dos %2d pontos a origem e %4.1f",cont-1,s);//cont-1 porque se nao contava o (0,0) como ponto
	System.out.println("O ponto mais afastadado da origem foi: ");
	escreverPonto (Pmax);
 }
  
	public static double distancia(Ponto2D p1, Ponto2D p2)
	{
	
	double dist = Math.sqrt(Math.pow(p2.y-p1.y,2)+Math.pow(p2.x-p1.x,2));
	return dist;
	}
	
	
  
  
	public static void	escreverPonto (Ponto2D pto){
	{
		System.out.printf("(%3.1f,%3.1f)\n", pto.x, pto.y);
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
