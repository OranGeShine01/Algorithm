import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		Integer[] n1 = new Integer[n.length()];
		
		for (int i=0; i<n1.length; i++) {
			n1[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
		}
		
		Arrays.sort(n1, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n1.length; i++) {
			sb.append(n1[i]);
		}
		
		System.out.println(sb);
		

	}

}