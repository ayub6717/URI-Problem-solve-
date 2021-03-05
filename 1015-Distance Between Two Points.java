import java.util.*;

public class Main {

	public static void main(String[] args) {
		double x1,X2,y1,y2;

		Scanner sc = new Scanner(System.in);

		x1=sc.nextDouble();
		y1=sc.nextDouble();
		X2=sc.nextDouble();
		y2=sc.nextDouble();
		double total=Math.sqrt((X2-x1)*(X2-x1)+(y2-y1)*(y2-y1));
		System.out.printf("%.4f\n",total);
	}

}