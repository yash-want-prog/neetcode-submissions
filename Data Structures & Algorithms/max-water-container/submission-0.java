class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right=n-1;
        int area = 0;
        while(left<right){
          int width = right - left;
          int maxHeight = Math.min(heights[left], heights[right]);

          area = Math.max(area, width * maxHeight);

          if(heights[left] < heights[right]){
            left++;
          }else{
            right--;
          }
        }
        return area;
    }
}
