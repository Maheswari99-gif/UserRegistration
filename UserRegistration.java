import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Password");
		String p=s.next();
		String check="[A-Za-z0-9]{8,}$";
		if(p.matches(check))
		System.out.println("Valid");
		else
		System.out.println("Invalid");
	}
}
