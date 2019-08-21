//  https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() <= 1) 
            return 0;
        int sum = 0;
        for (int i = 0; i < A.size() - 1; i++) {
            int x = Math.abs(A.get(i + 1) - A.get(i));
            int y = Math.abs(B.get(i + 1) - B.get(i));
            if (y > x)
                sum += Math.abs(y); 
            else 
                sum += Math.abs(x); 
        }
        return sum;
    }
}
