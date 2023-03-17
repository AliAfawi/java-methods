package questionsa;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Input the first number:");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		System.out.println("Input the second number:");
		b=in.nextInt();
		System.out.println("Input the third number:");
		c=in.nextInt();
		in.close();
		
		System.out.println("The average value is: "+ avg(a,b,c));
	}
		
	public static double avg(int a, int b, int c) {
			double avg=(a+b+c)/3;
			return avg;
		


	}

}
