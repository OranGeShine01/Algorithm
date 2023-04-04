import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<String> deque = new ArrayDeque();
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String str = st.nextToken();
			if (str.equals("push_back")) {
				String str2 = st.nextToken();
				deque.offerLast(str2);
			} else if (str.equals("push_front")) {
				String str2 = st.nextToken();
				deque.offerFirst(str2);
			} else if (str.equals("front")) {				
				if (deque.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(deque.peekFirst() + "\n");
				}
			} else if (str.equals("back")) {
				if (deque.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(deque.peekLast() + "\n");
				}
			} else if (str.equals("size")) {
				sb.append(deque.size() + "\n");
			} else if (str.equals("empty")) {
				if (deque.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			} else if (str.equals("pop_front")) {
				if (deque.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(deque.pollFirst()+"\n");
				}
			} else if (str.equals("pop_back")) {
				if (deque.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(deque.pollLast()+"\n");
				}
			}
		}
		System.out.println(sb);
	}
}
