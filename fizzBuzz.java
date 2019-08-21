//  https://www.interviewbit.com/problems/fizzbuzz/

public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder build = new StringBuilder();
        for (int i = 1; i <= A; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                build.append("FizzBuzz");
            } else if (i % 3 == 0) {
                build.append("Fizz");
            } else if (i % 5 == 0) {
                build.append("Buzz");
            } else {
                build.append(i);
            }
            if (i < A)
                build.append(" ");
        }
        list.add(build.toString());
        return list;
    }
}
