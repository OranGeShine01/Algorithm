class Solution {
    public int solution(int n) {
        return (n%2==0) ? 2*(n/2)*(n/2+1)*(n+1)/3 : (n+1)*(n+1)/4;
    }
}