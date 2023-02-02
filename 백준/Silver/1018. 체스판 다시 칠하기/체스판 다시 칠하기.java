import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String xy = br.readLine();
		StringTokenizer st = new StringTokenizer(xy);
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
				 
		boolean wb[][] = new boolean[x][y]; // 입력값을 받을 배열
		int count[] = new int[2];
		// 다시 칠할 횟수를 판단할 배열, 첫수가 W일때, B일때 각각 나눔.
		int min = 64;
		// 갱신할 최솟값
		
		for (int i=0; i<x; i++) {
			String str = br.readLine();
			for (int j=0; j<y; j++) {
				
				if (str.charAt(j) == 'W') {
					wb[i][j] = true;
				} else {
					wb[i][j] = false;
				}
			}
		} // 배열에 입력값 채워넣기
		
		for (int m=0; m<x-7; m++) {
			for (int l=0; l<y-7; l++) {
				for (int k=0; k<2; k++) {
					for (int i=m; i<m+8; i++) {
						for (int j=l; j<l+8; j++) {
							if (k==0) {
								if ((i+j)%2==0 && wb[i][j]==false) {
									count[k]++;
								} else if ((i+j)%2==1 && wb[i][j]==true) {
									count[k]++;
								}
							} else {
								if ((i+j)%2==0 && wb[i][j]==true) {
									count[k]++;
								} else if ((i+j)%2==1 && wb[i][j]==false) {
									count[k]++;
								}
							}
						}
					}

					if (count[k] < min) {
						min = count[k];
					}

					count[0] = 0;
					count[1] = 0;
				}
			}
		}
		
		System.out.println(min);		

	}

}