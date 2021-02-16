import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, s, w;
		float d,x;
		Scanner sc = new Scanner(System.in);
		
		w = sc.nextInt();
		b = sc.nextInt();
		d = sc.nextFloat();
		
		a = sc.nextInt();
		s = sc.nextInt();
		x = sc.nextFloat();

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", (d * b + s * x));
	}
}