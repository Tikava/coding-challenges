package LeetCode.Medium;

public class ReverseInteger {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        try {
            if (x < 0) {
                return Integer.parseInt('-' + sb.reverse().toString().substring(0, sb.length() - 1));
            } else {
                return Integer.parseInt(sb.reverse().toString());
            }
        } catch (NumberFormatException e) {
            return 0;
        }
        
    }
}
