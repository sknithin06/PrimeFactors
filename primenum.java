package Java;
import java.util.Scanner;
public class primenum {
	public static void main(String[] args) {
		System.out.println("Welcome To Prime Factor");
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a number:");  
		int n = sc.nextInt();
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			while (n % i == 0) {
				System.out .println("prime factor of the given number is:"+i);
				n = n / i;
			}
		}
		if ( n > 2) {
			System.out .println("prime factor of the given number is:"+n);
		}
	}
}
