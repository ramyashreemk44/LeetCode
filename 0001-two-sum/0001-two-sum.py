class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        
        """
        hmap={}
        for i in range(len(nums)):
            x=target-nums[i]
            if x in hmap:
                return [i, hmap[x]]
            hmap[nums[i]]=i
            
        