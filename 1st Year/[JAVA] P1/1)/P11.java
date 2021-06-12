import java.util.Scanner;



public class P11
{
  public static double convert(double amount)
  {
    // write the body of this method.
    return amount;
  }
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter amount $: ");
    double amount = input.nextDouble();
    System.out.println("Euro: ");
    System.out.print(convert(amount));
    input.close();
  }
}
