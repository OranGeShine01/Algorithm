import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int d = 0;
        for (int i=0; i<l1-1; i++) {
            String str = str1.substring(i, i+2).toUpperCase();
            if (str.matches("[A-Za-z]+")) {
                map1.put(str, map1.getOrDefault(str, 0)+1);
                d++;
            }
        }
        
        int n = 0;
        
        for (int i=0; i<l2-1; i++) {
            String str = str2.substring(i, i+2).toUpperCase();
            if (str.matches("[A-Za-z]+")) {
                if (map1.containsKey(str) && map1.get(str)>=1) {
                    n++;
                    map1.put(str, map1.get(str)-1);
                }                
                else d++;
            }             
        }
        
        System.out.println(n);
        System.out.println(d);
        
        return (n==0 && d==0) ? 65536 : (int)(n*1.0/d*65536);
    }
}