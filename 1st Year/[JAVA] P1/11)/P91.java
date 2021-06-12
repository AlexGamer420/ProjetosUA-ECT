/*  JAM, dez-2020
 *  Classe String - métodos vários
 */
import java.util.Scanner;

public class P91 
{

    public static void main(String []args)
     {
	Scanner input = new Scanner(System.in);
		int upperCase=0; int lowerCase=0; int digit=0; int vowel=0; int letter=0; int cons=0;
		char c;

		System.out.println("Analise de uma frase ");
		System.out.print("Frase de entrada -> ");

		String frase = input.nextLine();
					
			for (int i = 0; i <frase.length();i++)
			{
				c=s1.charAt(i);
			if (Character.isUpperCase(frase.charAt(c))) upperCase++;
			if (Character.isLowerCase (frase.charAt (c))) lowerCase++;
			if (Character.isDigit (frase.charAt (c))) digit++;
			if (Character.isLetter (frase.charAt (c))) letter++;
			if (isVowel(c)) vowel++;
			}
			cons=letter-vowel;
			
	System.out.printf("Numero de caracteres minusculos -> %d ",lowerCase);
	System.out.println();
	System.out.printf("Numero de caracteres maiusculos -> %d ",upperCase);
	System.out.println();
	System.out.printf("Numero de caracteres numericos -> %d ",digit);
	System.out.println();
	System.out.printf("Numero de vogais -> %d ",vowel);
	System.out.println();
	System.out.printf("Numero de consoantes -> %d ",cons);
	}


	public static boolean isVowel(char c)
	{
	boolean Xvowel=false;

    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') Xvowel=true;
    if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') Xvowel=true;
    return Xvowel;
} 
}				
		
					
