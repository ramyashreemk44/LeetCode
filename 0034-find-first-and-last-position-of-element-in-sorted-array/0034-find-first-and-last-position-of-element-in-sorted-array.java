class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fo = binarysearchfo(nums, 0, nums.length-1, target);
        if (fo == -1){
            return new int[] {-1,-1};
        }
        else{
        int la = binarysearchla(nums, fo, nums.length-1, target);
        return new int[]{fo, la};
        }
}
 public static int binarysearchfo(int[] nums, int left, int right, int target){
            int fo=-1;
            while (left<=right){
            int mid = (left+right)/2;
            if (target>nums[mid]){
                left=mid+1;
            }
            else if (target< nums[mid]){
                right=mid-1;
            }
            else{
                fo=mid;
                right=mid-1;
            }
        }
        return fo;
        }

        public static int binarysearchla(int[] nums, int left, int right, int target){
            int la=-1;
            while (left<=right){
            int mid = (left+right)/2;
            if (target>nums[mid]){
                left=mid+1;
            }
            else if (target< nums[mid]){
                right=mid-1;
            }
            else{
                la=mid;
                left=mid+1;
            }
        }
        return la;
        }
}