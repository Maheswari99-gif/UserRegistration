import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Name");
		String f=s.next();
		String check="[A-Z]{1}[a-z]*";
		Pattern p=Pattern.compile(check);
		Matcher m=p.matcher(f);
		if(m.matches())
		System.out.println("Valid");
		else
		System.out.println("Invalid");
	}
}
