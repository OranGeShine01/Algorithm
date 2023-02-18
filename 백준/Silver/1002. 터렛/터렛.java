import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			// 입력값 받기
			
			double d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
			// 두 직원 사이의 거리 (=두 원의 중심 사이의 거리)
			
			int rPlus = r1+r2;
			double rMinus = Math.abs(r1-r2);
			
			if (d==0) {
				if (r1==r2) {
					System.out.println(-1);
				} else {
					System.out.println(0);
				}			
			} else {
				if (d==rPlus || d==rMinus) {
					System.out.println(1);
				} else if (d>rPlus || d<rMinus) {
					System.out.println(0);
				} else if (d>rMinus && d<rPlus) {
					System.out.println(2);
				}
			}
			
		}

	}
}