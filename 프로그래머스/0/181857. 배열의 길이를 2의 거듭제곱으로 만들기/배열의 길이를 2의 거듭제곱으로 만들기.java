class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = (int)Math.pow(2, Math.ceil(Math.log(arr.length)/Math.log(2)));
        answer = new int[len];
        for (int i=0; i<answer.length; i++) {
            answer[i] = (i>=arr.length) ? 0 : arr[i];
        }
        return answer;
    }
}