class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left<=right){
           if(!isValid(Character.toLowerCase(s.charAt(left)))) left++;
           else if(!isValid(Character.toLowerCase(s.charAt(right)))) right--;
           else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
           else{
            left++;
            right--;
           } 
        }
        return true;
    }
    boolean isValid(char ch){
        if(ch >= 'a' && ch <='z') return true;
        if(ch >= '0' && ch <='9') return true;
        return false;
    }
}
