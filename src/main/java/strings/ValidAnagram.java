package strings;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        int aAsciiValue = 97;
        for (char c : s.toCharArray()) {
            chars[c - aAsciiValue] = chars[c - aAsciiValue] + 1;
        }

        for (char c : t.toCharArray()) {
            chars[c - aAsciiValue] = chars[c - aAsciiValue] - 1;
        }

        for (int charCount : chars) {
            if (charCount != 0) {
                return false;
            }
        }
        return true;
    }

}
