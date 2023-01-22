import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int temp = n/5;
		int ans = temp;

		ans++;

		for (int i=0; i<=(n/5); i++) {

			temp = n%5 + (5 * i);

			ans--;

			if (temp%3 == 0) {

				ans = ans + temp/3;
				System.out.println(ans);
				break;

			}				
		}			

		if (ans == 0) {

			System.out.println(-1);

		}
	}
}