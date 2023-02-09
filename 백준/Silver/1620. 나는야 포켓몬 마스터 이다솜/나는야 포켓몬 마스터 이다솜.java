import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	static HashMap<String, Integer> poke;
	static String[] poke2;
	
	// 포켓몬 도감은 매소드와 메인이 전부 공유하는 글로벌 변수를 위해 Static 변수로 설정
	// HashMap 자료형은 이름으로 도감번호를 호출, 배열은 도감번호로 이름을 호출.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 초기 도감 목록수
		int m = Integer.parseInt(st.nextToken()); // 맞춰야하는 입력수
				
		poke = new HashMap<>();
		poke2 = new String[n];
		
		for (int i=0; i<n; i++) {
			
			String name = br.readLine();
			poke.put(name, i);
			poke2[i] = name;
			
		} // 각 자료별로 입력값을 받아온다.
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<m; i++) {
			sb.append(find(br.readLine()) + "\n");
		}
		
		System.out.println(sb);
		
	}
	
	static boolean isInt(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	static String find(String str) {
		
		if (isInt(str)) {
			return poke2[Integer.parseInt(str)-1];
		} else {
			return String.valueOf(poke.get(str)+1);
		}		
	}
}