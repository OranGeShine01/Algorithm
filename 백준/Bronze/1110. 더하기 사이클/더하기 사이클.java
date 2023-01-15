import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = 0;
		int [] n2 = new int [4];
		
			n1 = Integer.parseInt(br.readLine());
			n2[0] = n1/10;	n2[1] = n1%10;
			n2[2] = -1;		n2[3] = -1;
			int i;
			
			for (i=0; !(n1/10==n2[2]&&n1%10==n2[3]); i++) {
					
					n2[2]=n2[1];
					n2[3]=(n2[0]+n2[1])%10;
					n2[0]=n2[2];
					n2[1]=n2[3];
					
			
			}	
			System.out.println(i);
			
	}	
}