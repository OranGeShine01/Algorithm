import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());	// 입력값(영화제목이들어간수)읽어들이기
		int num = 0;
		int count = 0;
		
		for (int i=666; count!=n; i++) {
			
			if (String.valueOf(i).contains("666")) {
				
				num = i;
				count++;
								
			}
			
		}
		
		System.out.println(num);
								
	}
}
