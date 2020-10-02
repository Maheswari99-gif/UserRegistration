import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Email Id");
		String e=s.next();
		String check="^[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		Pattern p=Pattern.compile(check);
		Matcher m=p.matcher(e);
		if(m.matches())
		System.out.println("Valid");
		else
		System.out.println("Invalid");
	}
}
