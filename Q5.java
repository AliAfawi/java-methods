package questionsa;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		String str;
		int count=1;
		System.out.println("Input the string: ");
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		for (int i = 0; i < str.length(); i++) 
			if (str.charAt(i)==' ') 
				count++;
			
		System.out.println("Number of words in the string: "+count);
	}

}
