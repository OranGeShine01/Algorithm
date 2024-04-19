class Solution {
    
    public int[] solution(int[] arr) {
        int min = -1;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==2) {
                if (min == -1) min = i;
                else max = i;
            }
        }
        
        if (min == -1 && max == -1) {
            return new int[]{-1};
        }
        
        if (max == -1) return new int[]{2};
        
        int[] answer = new int[max - min + 1];
        for (int i = min; i <= max; i++) {
            answer[i - min] = arr[i];
        }
        
        return answer;
    }
}