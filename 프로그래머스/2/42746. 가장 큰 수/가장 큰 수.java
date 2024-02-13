import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        int l = numbers.length;
        String[] str = new String[l];
        for (int i=0; i<l; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
           @Override
            public int compare(String str1, String str2) {
                return (str2+str1).compareTo(str1+str2);
            }
        });
        if (str[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String i : str) {
            sb.append(i);
        }
        return sb.toString();
    }
}