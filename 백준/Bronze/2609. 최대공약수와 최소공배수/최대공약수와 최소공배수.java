import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		if (x>y) {
			int temp = x;
			x = y;
			y = temp;
		}
		
		for (int i=x; i>=1; i--) {
			if (x%i==0 && y%i==0) {
				System.out.println(i);
				break;
			}
		}
				
		int k = y;
		
		while (true) {
			
			if (k%y==0 && k%x==0) {
				System.out.println(k);
				break;
			}
			k++;
		}

	}

}
