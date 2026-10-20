class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while(left != s.length/2){
            swap(left, right, s);
            left++;
            right--;
        }
    }
    static void swap(int first, int second, char[] s){
        char temp = s[first];
        s[first]  = s[second];
        s[second] = temp;
    }
}