//  https://www.interviewbit.com/problems/find-duplicate-in-array/a

public class Solution {
    public int repeatedNumber(final List<Integer> a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            map.put(a.get(i), map.getOrDefault(a.get(i),0) + 1);
            int val = map.get(a.get(i));
            if (val > 1)
                return a.get(i);
        }
        return -1;
    }
}
