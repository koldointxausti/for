import java.util.Scanner;
public class For1 {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		for (long i=a;i>1;i--) {
			if (a % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}