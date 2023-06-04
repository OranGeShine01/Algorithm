class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        boolean even = true;

         String[] chars = s.split("");
         StringBuilder sb = new StringBuilder();

         for (String ch : chars) {
             if (even) {
                 sb.append(ch.toUpperCase());
             }
             else {
                 sb.append(ch);
             }

             even = !even;
             if (ch.equals(" ")) {
                 even=true;
             }
         }
         return sb.toString();
    }
}