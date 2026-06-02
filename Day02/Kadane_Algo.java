class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int s = nums[0];

        for(int i=1;i<n;i++)
        {
            s = Math.max(nums[i], nums[i]+s);
            max = Math.max(max, s);
        }

        return max;
    }
}