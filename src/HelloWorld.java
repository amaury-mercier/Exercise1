import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello ASE2017 - How are you yet ? :)");
		System.out.print("Please enter your name : ");
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		HelloUser user = new HelloUser(userName);
		user.greetUser();
		sc.close();	
	}

}
