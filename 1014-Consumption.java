import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
		float y;

		Scanner sc = new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextFloat();
		
		System.out.printf("%.3f km/l\n", x/y);
	}

}