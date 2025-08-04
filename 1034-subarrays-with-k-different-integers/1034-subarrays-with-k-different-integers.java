/*class Solution {
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
}*/


class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int i = 0, count = 0;

        for (int j = 0; j < nums.length; j++) {
            freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            if (freq.get(nums[j]) == 1) {
                k--;  
            }

            while (k < 0) {
                freq.put(nums[i], freq.get(nums[i]) - 1);
                if (freq.get(nums[i]) == 0) {
                    k++;
                }
                i++;
            }

            count += j - i + 1;
        }

        return count;
    }
}
