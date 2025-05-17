class Solution {
    public int maximizeSum(int[] nums, int k) {
        int i=0,max=0,result=0;

        for(int j=0;j<nums.length;j++) {
            max=Math.max(max,nums[j]);
            }

        while(i<k){
            result+=max+i;
            i++;
        }
        
        return result;
    }
}