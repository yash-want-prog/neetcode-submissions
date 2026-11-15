class Solution {
    public int lengthOfLongestSubstring(String s) {
        // map to track the lastest index of the character seen and update
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int ans = 0;
        while(right < s.length() && left <= right){
           if(!map.containsKey(s.charAt(right))){
            map.put(s.charAt(right), right);
            ans = Math.max(ans, right-left+1);
            right++;
           }else{
            //ans = Math.max(ans, right-left+1);
            left = map.get(s.charAt(right))+1;
            map.clear();   // reinitalise the window
            right=left;
            
           }
        }
        return ans;
    }
}
