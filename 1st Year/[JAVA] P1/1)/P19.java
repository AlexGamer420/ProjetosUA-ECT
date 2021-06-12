import java.util.Scanner;

public class P19
{
  public static void main(String[] args)
  {
    String name, surname;
    char n, s;
    boolean tf;
    int q1, q2;
    Scanner sc= new Scanner(System.in);
    System.out.print("Name: ");
    name=sc.nextLine();
    System.out.print("Surname: ");
    surname=sc.nextLine();
    
       
	
    n= name.charAt(0);
    s= surname.charAt(0);
    if (Character.isUpperCase(n) && Character.isUpperCase(s))
    {
        tf = true;
    } else 
    {
        tf = false;
    }
    
    n= Character.toUpperCase(n);
    s= Character.toUpperCase(s);
    q1= name.length();
    q2= surname.length();
    q1= q1+q2;
    
    System.out.printf("%s %s, %c%c, %d, %b", name, surname, n, s, q1, tf);    
  }
}





 
	  
