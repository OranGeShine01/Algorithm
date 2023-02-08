import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 집합S에 포함된 문자열들
		int m = Integer.parseInt(st.nextToken()); // 검사해야하는 문자열들
		
		String[] s = new String[n];
		String[] search = new String[m];
		
		for (int i=0; i<n; i++) {
			s[i] = br.readLine();
		}
		
		Arrays.sort(s);
		count = 0; // 집합S에 포함된 갯수
		
		for (int i=0; i<m; i++) {
			search[i] = br.readLine();
			set(s, search[i]);
		}
		
		System.out.println(count);		
		
	}
	
	static void set(String[] s, String search) {
		
		int leftIdx = 0;
		int rightIdx = s.length-1;
		
		while (leftIdx<=rightIdx) {
			int avg = (leftIdx + rightIdx)/2;
			String mid = s[avg]; // 비교대상으로, 범위의 중간부터 비교해준다.
			if (search.compareTo(mid)==0) { 
				// search와 mid가 같을 때
				count++;
				return;
			} else if (search.compareTo(mid)<0) { 
				// search가 mid보다 앞에 올 때
				rightIdx = avg-1;
			} else if (search.compareTo(mid)>0) { 
				// 그냥 else로 표현해도 되지만, 가시성을 위해 표기
				leftIdx = avg+1;
			}			
		}		
		
		return;
	}
}