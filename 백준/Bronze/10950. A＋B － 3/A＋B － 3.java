import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		for (int j=1;j<=i;j++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}

	}

}