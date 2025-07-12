class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int len=nums.length;
        int[] diffArr=new int[len+1];
        for(int i=0;i<queries.length;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            diffArr[left]+=1;
            diffArr[right+1]-=1;
        }

        int subtract=0;

        for(int i=0;i<len;i++){
            subtract+=diffArr[i];
            if ((nums[i]- subtract)>0) return false;
        }

        return true;
    }
}