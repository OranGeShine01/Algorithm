import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int len = arr.length;
        int[] arr2 = new int[len];
        
        boolean same = false;
        while (!same) {
            for (int i = 0; i < len; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr2[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr2[i] = arr[i] * 2 + 1;
                } else {
                    arr2[i] = arr[i];
                }
            }
        
            same = Arrays.equals(arr, arr2);
            
            arr = arr2.clone();
            answer++;
        }
        
        
        
        return answer - 1;
    }
}