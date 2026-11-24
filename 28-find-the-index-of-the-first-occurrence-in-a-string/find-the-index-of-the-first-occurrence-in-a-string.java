class Solution {
    public int strStr(String haystack, String needle) {
       
        int length=needle.length();
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+length).equals(needle)){
                return i;
            }
        }
        return -1;
        // int result=-1;
        // char ch=needle.charAt(0);
        // for(int i=0;i<=(haystack.length()-needle.length());i++){
        //     char ch1=haystack.charAt(i);
        //     if(ch==ch1 ){
        //         if( haystack.substring(i,i+needle.length()).equals(needle)){
        //             result=i;
        //             break;
        //         }
        //     }
        // }
        // return result;
    }
}