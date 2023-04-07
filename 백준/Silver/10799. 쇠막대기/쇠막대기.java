import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().replace("()", "/");
		Queue<Character> queue = new LinkedList<>();
		int count = 0;
		int ans = 0;
		
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if (c=='(') {
				queue.offer('(');
			} else if (c==')') {
				queue.poll();
				ans++;
			} else if (c=='/') {
				ans+=queue.size();				
			}
		}		
		System.out.println(ans);
	}
}