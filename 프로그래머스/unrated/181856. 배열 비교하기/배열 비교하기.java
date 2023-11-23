class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length>arr2.length) return 1;
        else if (arr1.length<arr2.length) return -1;
        
        int[] sum = new int[2];
        
        for (int i=0; i<arr1.length; i++) {
            sum[0]+=arr1[i];
            sum[1]+=arr2[i];
        }
        
        if (sum[0]>sum[1]) return 1;
        else if (sum[0]<sum[1]) return -1;
        else return 0;
    }
}