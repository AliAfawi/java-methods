package questionsa;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		String str;
		int count=0;
		System.out.println("Input the string: ");
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		for (int i = 0; i < str.length(); i++) {
//			char tmp = str.charAt(i);
//			if (tmp=='a' || tmp=='u' || tmp=='i' || tmp=='e' || tmp=='o' ) 
//				count++;
			
//			String tmp = str.substring(i,i+1);
//			System.out.println(tmp);
//			if (tmp=="a" || tmp=="u" || tmp=="i" || tmp=="e" || tmp=="o" ) 
//				System.out.println("aliii");

		}
		System.out.println("Number of  Vowels in the string: "+count);
		
	}
}


