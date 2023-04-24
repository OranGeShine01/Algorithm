import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		boolean[] prime = new boolean[n+1]; // false면 소수, true면 소수아님

		for (int i=0; i<=Math.sqrt(n); i++) {

			if (i<2) {

				prime[i] = true;
				continue;

			}

			if (prime[i] == true) {

				continue;

			}


			for (int j=i*i; j<prime.length; j+=i) {

				prime[j] = true;

			}



		}

			for (int i=m; i<prime.length; i++) {

				if (prime[i] == false) {

					System.out.println(i);

				}

			}
	}

}