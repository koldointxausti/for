import java.util.Scanner;
public class For1 {
	public static void main (String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		long a=sc.nextInt();
		for (int i=2;i<a;i++) {
			long b=a%i;
			if(b!=0) {
				System.out.print(i+ " , ");
			}
		}
	}
}
