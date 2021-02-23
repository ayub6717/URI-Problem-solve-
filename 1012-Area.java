import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float a,b,c,triangle,trapezium,square,rectagle;
		double circle;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		triangle=a*c/2;
		circle= 3.14159*c*c;
		trapezium=(a+b)*c/2;
		square = b*b;
		rectagle = a*b;

		System.out.printf("TRIANGULO: %.3f\n", triangle);
		System.out.printf("CIRCULO: %.3f\n", circle);
		System.out.printf("TRAPEZIO: %.3f\n", trapezium);
		System.out.printf("QUADRADO: %.3f\n", square);
		System.out.printf("RETANGULO: %.3f\n", rectagle);

	}
}