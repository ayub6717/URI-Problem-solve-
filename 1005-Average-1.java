import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = (3.5 * A + 7.5 * B) / (3.5 + 7.5);
		System.out.printf("MEDIA = %.5f\n", C);
	}
}
