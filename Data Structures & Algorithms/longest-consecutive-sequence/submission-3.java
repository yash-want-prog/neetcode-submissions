class Solution {
    public int longestConsecutive(int[] nums) {
        // brute
        Set<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        int ans = 0;
        for(int s: set){
            if(!set.contains(s-1)){
                int start = s;
                int count = 0;
                while(set.contains(s)){
                    count++;
                    s++;
               }
               ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}