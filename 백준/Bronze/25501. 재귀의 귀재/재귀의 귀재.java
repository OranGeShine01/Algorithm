import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
    public static int[] recursion(String s, int l, int r, int count){
    	count++;
        if(l >= r) {
        	int[] result = new int[2];
        	result[0] = 1;
        	result[1] = count;
        	return result;
        } else if(s.charAt(l) != s.charAt(r)) { 
        	int[] result = new int[2];
        	result[0] = 0;
        	result[1] = count;
        	return result;
        }
        else return recursion(s, l+1, r-1, count);
    }
    
    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 0);
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException{
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	String[] str = new String[n];
    	
    	for (int i=0; i<n; i++) {
    		str[i] = br.readLine();
    		System.out.println(isPalindrome(str[i])[0] + " " + isPalindrome(str[i])[1]);
    	}
    }
}