class Solution {
    public long solution(String numbers) {
        long answer = 0;
        StringBuilder sb = new StringBuilder(numbers);
        StringBuilder ans = new StringBuilder();
        while (sb.length()!=0) {
        	String base = sb.substring(0, 3);
        	if (base.equals("zer")) {
            	sb.delete(0, 4);
            	ans.append("0");
            } else if (base.equals("one")) {
            	sb.delete(0, 3);
            	ans.append("1");
            } else if (sb.substring(0, 3).equals("two")) {
            	sb.delete(0, 3);
            	ans.append("2");
            } else if (base.equals("thr")) {
            	sb.delete(0, 5);
            	ans.append("3");
            } else if (base.equals("fou")) {
            	sb.delete(0, 4);
            	ans.append("4");
            } else if (base.equals("fiv")) {
            	sb.delete(0, 4);
            	ans.append("5");
            } else if (base.equals("six")) {
            	sb.delete(0, 3);
            	ans.append("6");
            } else if (base.equals("sev")) {
            	sb.delete(0, 5);
            	ans.append("7");
            } else if (base.equals("eig")) {
            	sb.delete(0, 5);
            	ans.append("8");
            } else if (base.equals("nin")) {
            	sb.delete(0, 4);
            	ans.append("9");
            }
        }
        
        
        answer = Long.parseLong(ans.toString());        
        
        return answer;
    }
}