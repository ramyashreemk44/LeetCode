class Solution {
    public long countSubarrays(int[] nums, long k) {
       int product=1,j=0,i=0;
       long count=0,sum=0;
       while(j<nums.length) {
            sum+=nums[j];
            if(sum*(j-i+1)<k){
                count+=j-i+1;
            }
            else{
                while(i<=j && sum*(j-i+1) >=k){
                    sum-=nums[i];
                    i++;
                }
                count+=j-i+1;
            }
            j++;
       }
       return count;
    }
}

