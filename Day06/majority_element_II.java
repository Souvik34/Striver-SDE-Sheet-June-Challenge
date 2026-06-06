class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0, c2=0;
        int ct1=0, ct2=0;

        for(int num:nums)
        {
            if(c1==num)
            {
              ct1++;
            }
            else if(c2==num)
            {
                ct2++;
            }
            else if(ct1 ==0)
            {
                ct1=1;
                c1=num;
            }
            else if(ct2 ==0)
            {
                ct2=1;
                c2=num;
            }

            else
            {
                ct1--;
                ct2--;
            }
        }

        ct1 =0;
        ct2=0;

        for(int num:nums)
        {
            if(num==c1) ct1++;
            else if(num==c2) ct2++;

        }

          List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        if (ct1 > n / 3) ans.add(c1);
        if (ct2 > n / 3) ans.add(c2);

        return ans;
    }
}