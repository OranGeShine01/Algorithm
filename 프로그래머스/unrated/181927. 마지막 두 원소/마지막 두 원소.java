class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        for (int i=0; i<answer.length; i++) {
            if (i!=answer.length-1) answer[i] = num_list[i];
            else if (num_list[num_list.length-1] > num_list[num_list.length-2]) 
                answer[i] = answer[i-1] - answer[i-2];
            else answer[i] = answer[i-1]*2;
        }
        return answer;
    }
}