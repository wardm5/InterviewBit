//  https://www.interviewbit.com/problems/reverse-the-string/

public class Solution {
    public String reverseWords(String a) {
        if (a == null || a.length() == 0)
            return "";
        String[] arr = a.split("[ ]+");
        StringBuilder build = new StringBuilder();
        for (int i = arr.length - 1; i > 0; i--) {
            build.append(arr[i]).append(" ");
        }
        build.append(arr[0]);
        return build.toString();
    }
}
