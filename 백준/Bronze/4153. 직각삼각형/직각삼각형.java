import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str = br.readLine();
			if (str.equals("0 0 0")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str," ");
			int[] tri = new int[3];					
			
			for (int i=0; i<3; i++) {
				tri[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(tri);
			if (pow(tri[2])== pow(tri[0]) + pow(tri[1])) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}

	}
	
	static int pow(int x) {
		return (int) Math.pow(x, 2);
	}

}
