class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int totalCount = 0,left_far= 0,left_near=0,right = 0;
        HashMap<Integer,Integer> intCount=new HashMap<>();
        while (right < nums.length) {
            intCount.put(nums[right], intCount.getOrDefault(nums[right], 0) + 1);
            while(intCount.size()>k){
                intCount.put(nums[left_near],intCount.get(nums[left_near])-1);
                if(intCount.get(nums[left_near])==0) intCount.remove(nums[left_near]);
                left_near+=1;
                left_far=left_near;
            }

            while(intCount.get(nums[left_near])>1){
                intCount.put(nums[left_near],intCount.get(nums[left_near])-1);
                left_near+=1;
            }

            if(intCount.size()==k) totalCount+=left_near-left_far+1;
            right++;
        }
        return totalCount;
    }
}