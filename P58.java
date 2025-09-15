package CP;
// 58. Length of Last Word
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String str = arr[arr.length-1];
        return str.length();
    }
}