import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		int rst;
		
		if (d1==d2 && d2==d3) {
			
			rst = 10000+d1*1000;
			System.out.println(rst);
			
		}
		
		else if ((d1 != d2 && d1 != d3) && d2 != d3) {
			
			int max1;
			if (d1>=d2 && d1>=d3) {
				max1 = d1;
			}	else if (d2>=d1 && d2>=d3) {
				max1 = d2;
			}	else {
				max1 = d3;
			}
			
			rst = max1 * 100;
			System.out.println(rst);
			
			
		}
		
		else {
			
			int base1;
			if (d1 == d2 || d1 == d3) {
				
				base1 = d1;
				
				
				
			}
			
			else {
				
				base1 = d2;
				
			}
			
			rst = 1000 + base1 * 100;
			System.out.println(rst);
			
			
		}
		

	}

}