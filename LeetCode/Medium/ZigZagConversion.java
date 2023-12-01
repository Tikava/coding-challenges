package LeetCode.Medium;

//https://leetcode.com/problems/zigzag-conversion/
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        char[][] map = new char[numRows][1000]; //map

        int currIdx = 0;
        int i = 0;
        int j = 0;

        while (currIdx < s.length()) {
            if (i >= numRows) {
                i -= 2;
                j += 1;
                while (true) {
                    map[i][j] = s.charAt(currIdx);

                    if (i > 0 && currIdx < s.length() - 1) {
                        i--;
                        j++;
                        currIdx++;
                    } else 
                        break;
                }
            }
            map[i][j] = s.charAt(currIdx);
            currIdx++;
            i++;
        }

        return matrixToString(map);

    }

    String matrixToString(char[][] matrix) {
        String result = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((int)matrix[i][j] > 0) {
                    result += Character.toString(matrix[i][j]);
                }
            }
        }
        return result;
    }
}
