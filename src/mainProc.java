import java.util.Scanner;

public class mainProc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char c =  'n';
		int a,i,len=0,tem=0;
		int temp = 1;
		Scanner e = new Scanner(System.in);
		do {
		
		Scanner s= new Scanner(System.in);
		

		System.out.println("Please enter a number larger than 2 digits or enter 0 to quit: ");
	
		a=s.nextInt();
		
		
		
		while(temp <= a)
		{
			len++;
		    temp *= 10;
		}
		
		
		
		if(len < 3)
		{
			System.out.println("That isn’t larger than two digits please try again.");
		}
		
	    if (a == 0)
		{
			System.out.println("Thank you. Have a nice day");
			System.exit(0);
			break;
			
		}
		
		else if(len >= 3)
		{

			tem = 0;
			while (a > 0) {
				
				i= a % 10;
//				System.out.println(i);
				a = a / 10;
				tem = tem + i;
				int w = i;
				System.out.print(w + " + ");
				
			}
			System.out.println("0 = "+tem);
		}
		
		System.out.println("Want to go again Y or N?");
		c = e.next().charAt(0);
		
		
		if (c == 'N' || c == 'n')
		{
			System.out.println("Thank you. Have a nice day");
			System.exit(0);
		}
		
		else if(!(c == 'Y' || c == 'y'))
		{
			System.out.println("I said Y or N.");
			c = e.next().charAt(0);
		}
		
		}
		while (c == 'Y' || c == 'y');	
	}
	
}
