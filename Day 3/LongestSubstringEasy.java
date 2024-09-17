import java.util.HashSet;

public class LongestSubstringEasy {
    public static int findLongestSubstring(String s) {
        int i = 0, j = 0, maxLength = 0;
        HashSet<Character> currentChars = new HashSet<>();

        while (j < s.length()) {
            if (!currentChars.contains(s.charAt(j))) {
                currentChars.add(s.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            } else {
                currentChars.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest length: " + findLongestSubstring(s));
    }
}
