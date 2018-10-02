import java.util.Scanner;
public class For2 {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		int x = 0;
		for (long i=a;i>1;i--) {
			if (a!=i && a % i == 0) {
				x++;
			}
		}
		if (x==0){
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is not prime");
		}
		sc.close();
	}
}