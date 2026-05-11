class Solution {
    public int trap(int[] height) {
        /* 
            Time - O(N) Space - O(1)
            Water at any position depends on the shorter wall between the left and right sides.
            So if the left wall is shorter, the right wall can't help us—water is limited by the left side.
            That means we safely move the left pointer inward and calculate how much water can be trapped there.
            Similarly, if the right wall is shorter, we move the right pointer left.
            
            The leftmost and rightmost bars can never hold water above 
            them since there's no wall on one side to contain it.
            Including them in water calculations gives wrong results.
        */
        int n = height.length;
        int left = 0, right = n - 1;
        int leftMax = height[left], rightMax = height[right];
        int trappedWater = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                trappedWater += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                trappedWater += rightMax - height[right];
            }
        }
        return trappedWater;
    }
}
