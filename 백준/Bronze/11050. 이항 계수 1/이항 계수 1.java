import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(bc(n,k));
	}
	
	static int bc(int n, int k) {
		
		int npk = 1; // nPk 순열
		
		for (int i=n; i>n-k; i--) {
			npk = npk * i;
		}
		
		int kf = 1; // !k 팩토리얼
		
		for (int i=k; i>1; i--) {
			kf = kf * i;
		}
		
		return npk/kf;
	}

}
