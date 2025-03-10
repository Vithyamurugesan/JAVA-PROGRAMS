//Find the longest Common prefix.
import java.util.Scanner;
class Problemi {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Step 1: Find the shortest string
        String minStr = strs[0];
        for (String s : strs) {
            if (s.length() < minStr.length()) {
                minStr = s;
            }
        }

        // Step 2: Check if all strings start with the current prefix
        String res = minStr;
        for (String s : strs) {
            while (!s.startsWith(res)) { // Reduce prefix if not a match
                res = res.substring(0, res.length() - 1);
                if (res.isEmpty()) return ""; // No common prefix
            }
        }

        return res;
    }

    // Test the function
    public static void main(String[] args) {
        Problemi solution = new Problemi();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs)); // Output: "fl"
    }
}

