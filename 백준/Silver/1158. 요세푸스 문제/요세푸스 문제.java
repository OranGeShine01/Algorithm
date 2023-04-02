import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		Queue <Integer> queue = new LinkedList<>();
		
		for (int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		int count = 1;		
		sb.append("<");
		
		while (!queue.isEmpty()) {
			if (count%k!=0) {
				int temp = queue.peek();
				queue.remove();
				queue.add(temp);
			} else if (queue.size()==1) {
				sb.append(queue.peek()+">");
				queue.remove();
				break;
			} else {
				sb.append(queue.peek()+", ");
				queue.remove();
			}
			count++;
		}
		System.out.println(sb);
	}

}
