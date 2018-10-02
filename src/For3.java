import java.util.Scanner;
public class For3 {
	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int z = 0;
		if (a>b) {
			for (long i=b;i<=a;i++) {
				if (primeNumber(i)) {
					z++;
				}
			}
		}else if(a!=b) {
			for (long i=a;i<=b;i++) {
				if (primeNumber(i)) {
					z++;
				}
			}
		}
		System.out.println("There are " + z + " prime numbers beetween the given numbers");
		sc.close();
	}
	public static boolean primeNumber (long n) {
		int x=0;
		for (long y=n;y>1;y--) {
			if (n!=y && n % y == 0) {
				x++;
			}
		}
		if (x==0){
			return true;	
		}else{
			return false;
		}
	}
}