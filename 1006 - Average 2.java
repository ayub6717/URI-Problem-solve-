import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double D = scan.nextDouble();
		double C = (2 * A + 3 * B + 5 * D) / (2 + 3 + 5);
		System.out.printf("MEDIA = %.1f\n", C);
	}
}
