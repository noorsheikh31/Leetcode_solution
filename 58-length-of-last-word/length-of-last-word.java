class Solution {
    public int lengthOfLastWord(String s) {
     String str=s.trim();
     String[] words=str.split(" +");
     int length=words.length;
     return words[length-1].length();       
    }
}