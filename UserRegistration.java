import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Mobile Number");
		String no=s.next();
		String check="[91]{2}\\s[6-9]{1}[0-9]{9}$";
		if(no.matches(check))
		System.out.println("Valid");
		else
		System.out.println("Invalid");
	}
}
