import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Last Name");
		String l=s.next();
		String check="[A-Z]{1}[a-z]{2,}";
		Pattern p=Pattern.compile(check);
		Matcher m=p.matcher(l);
		if(m.matches())
		System.out.println("Valid");
		else
		System.out.println("Invalid");
	}
}
