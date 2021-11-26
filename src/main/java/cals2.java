import java.util.Scanner;
public class cals2 
{
	public static void main(String srgs[])
	{
		System.out.println("WELCOME TO MY CALCULATOR");
		
		Scanner num = new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER");
		short first_num = num.nextShort();
		
		System.out.println("ENTER SECOND NUMBER");
		short second_num = num.nextShort();
		
		System.out.println("FIRST NUMBER IS "+first_num+" & SECOND NUMBER IS "+second_num);
	}
}
