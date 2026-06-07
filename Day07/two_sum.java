class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();

        int l= nums.length;
        for(int i=0;i<l;i++)
        {
            int num=nums[i];
            int need=target-num;

            if(map.containsKey(need))
            {
                return new int[] { i, map.get(need) }; 
            }
            map.put(nums[i],i);
        }

        return new int []{};
        
    }
}