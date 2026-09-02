class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l=0;
        int r=s.length()-1;
        //for(int i=0;i<s.length();i++){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
