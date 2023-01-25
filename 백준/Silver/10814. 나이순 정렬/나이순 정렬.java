import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] xy = new String[n][2]; // 값을 받을 2차원배열선언
		
		for (int i=0; i<n; i++) {
			String str1 = br.readLine();
			String[] str2 = str1.split(" "); // 입력값을 쪼개 배열로받기
			xy[i][0] = str2[0];	// 숫자가 뒤에와야 Arrays.sort를 쓰기 편함.
			xy[i][1] = str2[1];
		}
		
		Arrays.sort(xy, (e1, e2) -> {
			return Integer.parseInt(e1[0])-Integer.parseInt(e2[0]);
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			sb.append(xy[i][0] + " " + xy[i][1] + "\n");
		}
		
		System.out.println(sb);

	}

}