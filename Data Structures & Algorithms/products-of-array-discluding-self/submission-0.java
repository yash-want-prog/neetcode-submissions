class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int isZero = 0;
        for(int num : nums) {
            if(num==0) {
            isZero++;
            }else{
            prod = prod * num;
            }
        }
       
        int n = nums.length;
        int []ans = new int[n];
         if(isZero>1) {
            return ans;
         }
         // case of 1 or 0 times zerso
         for(int i=0; i<n; i++){
            if(nums[i]!=0 && isZero == 0){
                ans[i] = prod/nums[i];
            }else{
                if(nums[i] == 0 && isZero == 1){
                    ans[i] = prod;
                }else{
                    ans[i] = 0;
                }
            }
         }
        return ans;
    }
}  
