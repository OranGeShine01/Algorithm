import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer nx;
		StringTokenizer aa;
		StringBuilder sb = new StringBuilder();
		
		int n;	int x;
		
		nx = new StringTokenizer(br.readLine());
		n = Integer.parseInt(nx.nextToken());
		x = Integer.parseInt(nx.nextToken());
		
		aa = new StringTokenizer(br.readLine());
		int a[] = new int[n];
		
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(aa.nextToken());
		}
		
		for (int j=0; j<n; j++) {
			if (a[j]<x) {
				sb.append(a[j]+" ");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		

	}

}