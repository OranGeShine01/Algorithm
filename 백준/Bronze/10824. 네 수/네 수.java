import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Long.parseLong(st.nextToken() + st.nextToken());
		long b = Long.parseLong(st.nextToken() + st.nextToken());
		System.out.println(a+b);
	}

}
