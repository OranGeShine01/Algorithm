import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		double euclid = Math.pow(r, 2) * Math.PI;
		double taxi = Math.pow(r, 2) * 2;
		
		StringBuilder sb = new StringBuilder(euclid + "\n" + taxi);
		System.out.println(sb);

	}

}