import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<String> queue = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String last="";
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			String msg = str.substring(0,3);
			if (msg.equals("emp")) {
				if (queue.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			} else if (msg.equals("siz")) {
				sb.append(queue.size() + "\n");
			} else if (msg.equals("fro")) {
				if (queue.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(queue.peek() + "\n");
				}				
			} else if (msg.equals("bac")) {
				if (queue.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(last + "\n");
				}				
			} else if (msg.equals("pus")) {
				StringTokenizer st = new StringTokenizer(str, " ");
				st.nextToken();
				last = st.nextToken();
				queue.offer(last);
			} else if (msg.equals("pop")) {
				if (queue.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(queue.poll() + "\n");
				}
			}
		}
		System.out.println(sb);
	}
}
