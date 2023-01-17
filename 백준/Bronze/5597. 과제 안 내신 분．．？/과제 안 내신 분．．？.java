import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] ans = new boolean[30];
		for (int i=0; i<28; i++) {
			ans[Integer.parseInt(br.readLine())-1] = true;
		}
		for (int i=0; i<ans.length; i++) {
			if (!ans[i]) {
				System.out.println(i+1);
			}
		}
	}
}
