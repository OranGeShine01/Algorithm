import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		// 조리시간 : (A + (B+C)/60) 조리분 : (B+C)%60
		
		int CH = A+(B+C)/60;
		int CM = (B+C)%60;
		
		if (CH<24) {
			
			System.out.println(CH + " " + CM);
			
		}	else {
			
			System.out.println(CH%24 + " " + CM);
		}

	}

}