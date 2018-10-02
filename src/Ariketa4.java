import java.util.Scanner;

public class Ariketa4 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		for(int num = sc.nextInt();num != 0; num = sc.nextInt()) {
			System.out.println("This is its square: "+ num * num);
			System.out.println("Enter a number:");
		}
	}
}
