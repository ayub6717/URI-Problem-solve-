import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double R = scan.nextDouble();
		double valu = (4 / 3.0) * 3.14159 * R * R * R;
		System.out.printf("VOLUME = %.3f\n", valu);
	}
}