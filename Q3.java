package questionsa;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		String str;
		System.out.println("Input a string: ");
		Scanner in = new Scanner(System.in);
		str=in.nextLine();
		in.close();
		
		if (str.length()%2!=0) {
			System.out.println("The middle character in the string: "+ str.substring(str.length()/2,str.length()/2+1));
		}
		
		else {
			System.out.println("The middle character in the string: "+ str.substring(str.length()/2-1,str.length()/2+1));

		}
	
		
	}

}
