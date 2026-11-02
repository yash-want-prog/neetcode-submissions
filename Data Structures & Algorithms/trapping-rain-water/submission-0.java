class Solution {
    public int trap(int[] heights) {
        int n = heights.length;
        int []leftmax = new int[n];
        leftmax[0] = heights[0];

        int []rightmax = new int[n];
        rightmax[n-1] = heights[n-1];
        for(int i=1; i<n; i++){
           leftmax[i] = Math.max(leftmax[i-1], heights[i]);
        }
        for(int i=n-2; i>=0; i--){
            rightmax[i]=Math.max(rightmax[i+1], heights[i]);
        }
        int area = 0;
        for(int i=0; i<n; i++){
            int a = Math.min(leftmax[i], rightmax[i]) - heights[i];
            if(a>=0) area+=a;
        }
        return area;
    }
}

