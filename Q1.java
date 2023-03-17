package questionsa;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		int x,y,z,min;
		Scanner in= new Scanner(System.in);
		System.out.println("Input the first number: ");
		x=in.nextInt();
		System.out.println("Input the Second number: ");
		y=in.nextInt();
		System.out.println("Input the third number: ");
		z=in.nextInt();
		in.close();
		min = min(x,y);
		if (min>z)
			System.out.println("The smallest value is: "+z);

		System.out.println("The smallest value is: "+ min);

		}
	
	public static int min(int x, int y) {
		if (x<y)
			return x;
		return y;
	}

}
