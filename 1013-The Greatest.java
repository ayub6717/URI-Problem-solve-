import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = sc.nextInt();
		int maior=((a+b+Math.abs(a-b))/2);
		int q=((maior+s+Math.abs(maior-s))/2);
		System.out.println(q+" eh o maior");

	}

}