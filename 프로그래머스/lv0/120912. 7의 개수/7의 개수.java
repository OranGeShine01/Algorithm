class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int l = array.length; // 배열의 길이
        String[] arr = new String[l];
        for (int i=0; i<l; i++) {
        	arr[i] = String.valueOf(array[i]);
        	for (int j=0; j<arr[i].length(); j++) {
        		if (arr[i].charAt(j)=='7') {
        			answer++;
        		}
        	}
        }
        return answer;
    }
}