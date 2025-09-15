package CP;
// 125. Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder f = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                f.append(Character.toLowerCase(c));
            }
        }
        int left = 0;
        int right = f.length() - 1;
        while (left < right) {
            if (f.charAt(left) != f.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}