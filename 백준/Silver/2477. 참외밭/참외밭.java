import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static int[][] input;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		Map<Integer, Integer>count = new HashMap<>(); 
		// 방향 카운트를 위한 map자료형
		input = new int[6][2]; // 입력값을 받을 배열 


		for (int i=0; i<6; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int d = Integer.parseInt(st.nextToken()); // 방향
			int l = Integer.parseInt(st.nextToken()); // 길이
			count.put(d,count.getOrDefault(d, 0)+1);
			input[i][0] = d;
			input[i][1] = l;
			// 방향 카운트
		}

		int ans = 0;

		// if문을 통해, 방향 카운트에 따른 참외밭의 모양을 판별
		if (count.get(2)==1 && count.get(4)==1) {
			// ㄱ자모양
			for (int i=0; i<6; i++) {
				if (input[i][0] == 2) {
					// 1개뿐인 2방향 값을 이용하여 offset으로 모양을 유추
					System.out.println(ans(k, i));
				}
			}
		} else if (count.get(2)==1 && count.get(3)==1) {
			// 90도회전
			for (int i=0; i<6; i++) {
				if (input[i][0] == 2) {
					// 1개뿐인 2방향 값을 이용하여 offset으로 모양을 유추
					System.out.println(ans(k, i));
				}
			}
		} else if (count.get(1)==1 && count.get(3)==1) {
			// 180도회전, ㄴ자모양
			for (int i=0; i<6; i++) {
				if (input[i][0] == 1) {
					// 1개뿐인 2방향 값을 이용하여 offset으로 모양을 유추
					System.out.println(ans(k, i));
				}
			}
		} else if (count.get(1)==1 && count.get(4)==1) {
			// 270도회전
			for (int i=0; i<6; i++) {
				if (input[i][0] == 1) {
					// 1개뿐인 2방향 값을 이용하여 offset으로 모양을 유추
					System.out.println(ans(k, i));
				}
			}
		}
	}
	
	static int ans(int k, int i) {
		// offset을 이용하여 결과값을 계산하는 매소드
		return k * ((input[(i+1)%6][1] * input[(i+2)%6][1])
				+ (input[(i+4)%6][1] * input[(i+5)%6][1]));
	}
}