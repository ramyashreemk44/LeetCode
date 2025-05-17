class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmostgoal(nums, goal)-atmostgoal(nums, goal-1);
    }

    public int atmostgoal(int[] nums, int goal){
        int i =0,j=0,count=0,sum=0,k=goal;
        while(j<nums.length){
            sum+=nums[j];

            if(sum<=k) {
                count+=j-i+1;
            }
            else if (sum>k){
                while(i<=j && sum>k){
                    sum-=nums[i];
                    i++;

                    }
                    if (sum!=0 && sum<=k) count+=j-i+1;
                }
                j++;
            }
            return count;
        }
}
