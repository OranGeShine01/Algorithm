import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str;
		String arr[];
		double avg[];
		double result[];
		
		for (int i=0; i<n; i++) {
			int count = 0;
			str = br.readLine();	//입력받는 값
			arr = str.split(" ");	//입력받은 값을 배열로 나눔
			avg = new double [n];	//각 줄의 평균
			
			for (int j=0; j<Integer.parseInt(arr[0]); j++) {
				
				avg[i] = avg[i] + Integer.parseInt(arr[j+1]);
				
			}
			
			avg[i] = avg[i]/Double.parseDouble(arr[0]);
			
			for (int k=1; k<=Integer.parseInt(arr[0]); k++) {
				
				if (Integer.parseInt(arr[k]) > avg[i]) {
					
					count++;
					
				}
				
				
				
			}
			
			System.out.println(String.format("%.3f",(100*count/Double.parseDouble(arr[0]))) + "%");
			
			
		}
		

	}

}