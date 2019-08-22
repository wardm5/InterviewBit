//  https://www.interviewbit.com/problems/palindrome-integer/

public class Solution {
    public int isPalindrome(int A) {
        if (A < 0)
            return 0;
        StringBuilder build = new StringBuilder();
        while (A > 0) {
            build.append(A%10);
            A /= 10;
        }
        String result = build.toString();
        for (int i = 0; i < result.length()/2; i++) {
            
            if (result.charAt(i) != result.charAt(result.length()-1-i))
                return 0;
        }
        return 1;
    }
}
