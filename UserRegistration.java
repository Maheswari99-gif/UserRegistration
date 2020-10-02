import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	public static void main(String[] args){
	try{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Password");
		String p=s.next();
		String check="(?=.*[A-Z])(?=.*[0-9])[*.!@#$%^&(){}[]:;<>,.?/~_+=-|]{1}[a-zA-Z0-9]{7,}$";
		if(p.matches(check))
		System.out.println("Valid");
		else
		System.out.println("Invalid");
		}catch(Exception e){return;}
	}
}
