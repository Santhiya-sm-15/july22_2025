# july22_2025
The problem that i solved today in leetcode

You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.

An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).

Code:
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
