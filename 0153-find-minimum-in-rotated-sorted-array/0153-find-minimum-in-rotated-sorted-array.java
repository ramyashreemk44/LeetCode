class Solution {
    public int findMin(int[] nums) {
        int res=Integer.MAX_VALUE, mid=0;
        int l=0, r=nums.length;
        while(l<=r){
            mid =(l+r)/2;
            res= Math.min(res,nums[mid]);
            if (nums[mid] > nums[nums.length-1]){
                l=mid+1;
            }
            else r=mid-1;
        }
        return res;
    }
}
