import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float a, b;
		
		String c;

		Scanner sc = new Scanner(System.in);
		c = sc.nextLine();
		a = sc.nextFloat();
		b = sc.nextFloat();
		
		System.out.printf("TOTAL = R$ %.2f\n", (a) +(b * 0.15));
	}
}