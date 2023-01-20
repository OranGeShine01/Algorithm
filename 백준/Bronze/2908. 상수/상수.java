import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String str = br.readLine();
		String[]str2 = str.split(" ");
		
		int[][] a = new int[str2.length][3];	// 각 수의 자리별 숫자
		int[] b = new int[str2.length];	//두 수
		int[] bb = new int[str2.length]; // 뒤집힌수
		
		
		for (int i=0; i<str2.length; i++) {
			
			b[i] = Integer.parseInt(str2[i]);
			
			for (int j=0; j<=((int)Math.log10(b[i])); j++) {
				
				a[i][j] = (b[i]%(int)(Math.pow(10,j+1)))/(int)(Math.pow(10,j));
				
			}
			
						
		}
		
		for (int k=0; k<str2.length; k++) {
			
			for (int l=0; l<3; l++) {
				
				bb[k] = bb[k] + a[k][l]*(int)(Math.pow(10,2-l));
				
			}
			
		}
		
		if (bb[0] > bb[1]) {
			
			System.out.println(bb[0]);
			
		} else {
			
			System.out.println(bb[1]);
			
		}
		
		
		

	}

}