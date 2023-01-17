import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[42];
		int count = 0;
		
		for (int i=0; i<10; i++) {
			
			a[i] = Integer.parseInt(br.readLine());
			b[i] = a[i]%42; // 42로 나눈 나머지
			
		}
		
		for (int j=0; j<42; j++) {
			
			for (int k=0; k<10; k++) {
				
				if (b[k] == j) {	// 42로 나눈 나머지들이 각 0~41에 대응되는 수라면
					
					c[j]++;	// 해당 수의 카운트를 1 올린다.
					
				}
				
			}
			
		}
		
		for (int l=0; l<42; l++) {
			
			if (c[l]>0) {
				
				count++;	// 1개라도 나온 수를 추가하여 총 몇개의 수가 있는지 구함.
				
			}
			
		}
		
		
		
		System.out.println(count);

	}

}