class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int as = count(a, answers);
        int bs = count(b, answers);
        int cs = count(c, answers);
        
        if (as==bs && as==cs) {
            return new int[]{1, 2, 3};
        }
        else if (as==bs && as>cs) {
            return new int[]{1, 2};
        }
        else if (bs==cs && bs>as) {
            return new int[]{2, 3};
        }
        else if (cs==as && as>bs) {
            return new int[]{1, 3};
        }
        else if (as>bs && as>cs) {
            return new int[]{1};
        } 
        else if (bs>as && bs>cs) {
            return new int[]{2};
        }
        else {
            return new int[]{3};
        }
    }
    
    // 정답수를 판별하는 method
    int count(int[] arr,int[] answers) {
        int n = 0;
        int l = arr.length;
        int l2 = answers.length;
        for (int i=0; i<l2; i++) {
            if (arr[i%l] == answers[i]) {
                n++;
            }
        }
        return n;
    }
}