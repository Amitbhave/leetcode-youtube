package strings;

public class PalindromicSubstrings {

    public static int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += countSubstrings(s, i, i); // odd length
            count += countSubstrings(s, i, i + 1); //even length
        }

        return count;
    }

    public static int countSubstrings(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }

        return count;
    }

}
