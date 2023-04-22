import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = new String[str.length()];
		
		for (int i=0; i<str.length(); i++) {
			arr[i] = str.substring(i);
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for (String i : arr) {
			sb.append(i + "\n");
		}
		
		System.out.println(sb);
	}

}