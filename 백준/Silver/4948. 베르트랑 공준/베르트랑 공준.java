import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			boolean[] pn = new boolean[2*n+1]; // 소수 판별 배열, false(기본값)이면 소수

			if (n == 0) {

				System.exit(0);

			} else {

				pn[1] = true;

				for (int i=2; i<=Math.sqrt(2*n); i++) {

					if (pn[i] == true) {

						continue;

					}

					for (int j=i*i; j<pn.length; j+=i) {

						pn[j] = true;

					}
				}				
				
				for (int i=n+1; i<=2*n; i++) {
					
					if (pn[i] == false) {
						
						count++;
						
					}
					
				}
				
				System.out.println(count);
				
			}


		}
	}

}