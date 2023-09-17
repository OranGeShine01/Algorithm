class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        if (a%2!=0) a++;
        if (b%2!=0) b++;
        
        while (a!=b) {
            a=recur(a);
            b=recur(b);
            answer++;
        }
        return answer;
    }
    
    public int recur(int a) {
        if (a%2==0) a/=2;
        else a=a/2+1;
        if (a%2==1) a++;
        return a;
    }
}