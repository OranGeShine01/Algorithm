import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int hanoi[][];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 장대에 쌓인 원판의 갯수 
		int k = (int) (Math.pow(2, n)-1); // 옮긴 횟수
		int m = (k-1)/2; // 총 횟수의 가운데 부분.
		hanoi = new int[k][2]; // 하노이의 탑을 옮긴 기록을 순서대로 배열한 것.
		top(m, n, 1, 3); 
		System.out.println(k);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<k; i++) {
			sb.append(hanoi[i][0] + " " + hanoi[i][1] + "\n");
		}
		
		System.out.println(sb);

	}
	
	static void top(int m, int n, int start, int end) {
		
		// 하노이의 탑 구하는 매소드
		
		if (n==1) {
			hanoi[m][0] = start;
			hanoi[m][1] = end;
			return; // n=1인 경우, 시작부터 끝까지 옮기는 과정을 그대로 기록한다.
		} else {
			
			int x = (int)(Math.pow(2, n-2));
			int other = 0; // 시작지점과 목표지점을 제외한 중간지점
			
			
			if ((start == 1 || start == 2) && (end == 2 || end == 1)) {
				other = 3;
			} else if ((start == 1 || start == 3) && (end == 3 || end == 1)) {
				other = 2;
			} else if ((start == 2 || start == 3) && (end == 2 || end == 3)) {
				other = 1;
			}
	
			top(m-x,n-1,start,other); // n-1개의 원판을 중간지점까지 재귀호출하여 옮겨주고,
			top(m,1,start,end); // 마지막 n번째 원판은 그대로 옮겨주며, 횟수의 정가운데가 된다.
			top(m+x,n-1,other,end); // 아까 옮겼던 n-1개의 원판을 마저 옮겨주면 끝.
			
			return;
		}		
	}
}
