class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int n = nums.length;
        int [][]arr = new int[n][2];
        int idx = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            arr[idx][0] = entry.getKey();
            arr[idx][1] = entry.getValue();
            idx++;
        }
        Arrays.sort(arr, (a, b)->  Integer.compare(b[1], a[1]));      // descendimh
        int []ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = arr[i][0];
        }
        return ans;
    }
}
