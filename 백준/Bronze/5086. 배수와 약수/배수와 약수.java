import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str = br.readLine();
			if (str.equals("0 0")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(str," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if (y%x==0) {
				System.out.println("factor");
			} else if (x%y==0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}

	}

}