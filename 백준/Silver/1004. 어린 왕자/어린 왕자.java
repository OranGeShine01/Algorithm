import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine()); // 테스트케이스의 수 T
				
		StringBuilder sb = new StringBuilder();
				
		for (int i=0; i<t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			//출발점과 도착점을 받을 StringTokenizer
			int[] start = new int[2];
			int[] end = new int[2];
			
			start[0] = Integer.parseInt(st.nextToken());
			start[1] = Integer.parseInt(st.nextToken());
			end[0] = Integer.parseInt(st.nextToken());
			end[1] = Integer.parseInt(st.nextToken());
			
			int n = Integer.parseInt(br.readLine());
			//행성계의 수 N
			int c[][] = new int[n][3];
			//각 행성계의 중점과 반지름을 받을 배열
			
			int count=0; // 행성의 진입과 이탈을 셀 카운트값으로 최종출력값.
			
			for (int j=0; j<n; j++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
				c[j][0] = Integer.parseInt(st2.nextToken());
				//행성계의 x좌표
				c[j][1] = Integer.parseInt(st2.nextToken());
				//행성계의 y좌표
				c[j][2] = Integer.parseInt(st2.nextToken());
				//행성계의 반지름 r
				
				if (distance(start[0], start[1], c[j][0], c[j][1])<c[j][2]
						&& distance(end[0], end[1], c[j][0], c[j][1])>c[j][2]) {
					count++;
				} else if (distance(start[0], start[1], c[j][0], c[j][1])>c[j][2]
						&& distance(end[0], end[1], c[j][0], c[j][1])<c[j][2]) {
					count++;
				} // 행성계를 진입/이탈하려면, 시작점과 도착점 중 하나는 밖에, 나머지 하나는 안에 위치해야한다.				
			}			
			
			sb.append(count + "\n");
			
		}
		
		System.out.println(sb);
		
	}
	
	public static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
	}

}