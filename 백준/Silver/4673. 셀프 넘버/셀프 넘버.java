public class Main {
	
	public static int d(int n) {
		
		int result = n;
		while (n!=0) {
			
			result = result + n%10;
			n = n/10;
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int[] dn = new int[10000];
		boolean sn = true;
		
		for (int i=1; i<=10000; i++) {
			
			sn = true;
			
			for (int j=0; j<10000; j++) {
				
				dn[j] = d(j+1);
							
			}
			
			for (int k=0; k<10000; k++) {
				
				if (i == dn[k]) {
					
					sn = false;
					
				}
				
			}
			
			if (sn == true) {
				
				System.out.println(i);
				
			}
			
		}
		

	}

}
