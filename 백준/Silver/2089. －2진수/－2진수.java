import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		if (n==0) {
			System.out.println(0);
		} else {
			while (n!=0) {
				if (n%-2==0) {
					sb.insert(0, "0");
					n/=-2;
				} else if (n%-2==1) {
					sb.insert(0, "1");
					n/=-2;
				} else if (n%2==-1) {
					sb.insert(0, "1");
					n = n/-2 + 1;
				}
			}
			System.out.println(sb);
		}
	}	
}
