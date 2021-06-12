import java.util.Scanner;

public class P52
{
    public static void main(String[] args)
    {                         //função em uso:
        System.out.println(sqr(10));//sqr
        System.out.println(max(25.21,24.245));//max doubles
        System.out.println(max(2,3));//max ints
        System.out.println(poly3(3));//poly
        System.out.println(getIntPos("valor: "));//getIntPos
        System.out.println(getIntRange("x1:","x2: ",5));//getIntRange
        printNtimes(5,"ezpz lemon squeazy");
    }
    public static double sqr(double x)
    {
        double y;
        y = x*x;    
        return y;
    }
    
    public static double max(double x, double y)
    {
        double z = (y>=x) ? y:x;
        return z;
    }
    public static int max(int k, int o)
    {
        int z = (k>=o) ? k:o;
        return z;
    }
    public static double poly3(double x)
    {
        double px = -3*Math.pow(x,3) + 7*Math.pow(x,2) + 0*Math.pow(x,1) - 2*Math.pow(x,0);
        return px;
    }
    public static int getIntPos(String msg)
    {
        Scanner sc = new Scanner(System.in);
        int value=0;
        do{
        System.out.print(msg);
        value = sc.nextInt();
        }while(value<0);
        return value;
    }
    public static boolean getIntRange(String msg1, String msg2, int x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg1);
        int x1 = sc.nextInt();
        System.out.print(msg2);
        int x2 = sc.nextInt();
        boolean bool = ((x>=x1) && (x<=x2));
        return bool;
    }
    public static void printNtimes(int n, String spam)
    {
        for(int i=0; i<n; i++)System.out.print(spam);
    }
}
