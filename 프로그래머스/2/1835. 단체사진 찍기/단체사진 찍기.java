class Solution {
    
    final char[] members = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    final int memLen = members.length;
    int answer;
    String[] data;    
    
    public int solution(int n, String[] data) {
        answer = 0;
        this.data = data;
        dfs(new StringBuilder(), 0);
        return answer;
    }
    
    private void dfs(StringBuilder names, int visited) {
        int len = names.length();
        if (len == memLen) {
            if (isDataCheck(names.toString())) answer++;
            return;
        }
        
        for (int i = 0; i < memLen; i++) {
            if ((visited & (1 << i)) == 0) {
                names.append(members[i]);
                dfs(names, visited | (1 << i));
                names.deleteCharAt(len);
            }
        }
    }
    
    private boolean isDataCheck(String names) {
        for (String str : data) {
            char left = str.charAt(0);
            int leftIdx = names.indexOf(left);
            
            char right = str.charAt(2);
            int rightIdx = names.indexOf(right);

            int distance = Math.abs(leftIdx - rightIdx);
            
            int num = str.charAt(4) - '0';
            char oper = str.charAt(3);
            
            switch (oper) {
                case '=' :
                    if (distance != num + 1) return false;
                    break;
                case '<' :
                    if (distance >= num + 1) return false;
                    break;
                case '>' :
                    if (distance <= num + 1) return false;
            }
        }
        return true;
    }
}