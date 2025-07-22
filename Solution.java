class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        Set<Integer> st=new HashSet<>();
        int l=0,r=0;
        int max=0,sum=0;
        while(r<n)
        {
            while(st.contains(nums[r]))
            {
                st.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            sum+=nums[r];
            st.add(nums[r]);
            max=Math.max(max,sum);
            r++;
        }
        return max;
    }
}