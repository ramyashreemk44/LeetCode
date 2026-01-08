class Solution:
    def maxDotProduct(self, nums1: List[int], nums2: List[int]) -> int:
        if min(nums2)>0 and max(nums1)<0:
            return min(nums2)*max(nums1)
        if max(nums2)<0 and min(nums1)>0:
            return max(nums2)*min(nums1)            
        
        dp=[[0]*(len(nums2)+1 )for _ in range(len(nums1)+1)]
        for i in range(len(nums1)-1,-1,-1):
            for j in range(len(nums2)-1,-1,-1):
                curSum=(nums1[i]*nums2[j])+dp[i+1][j+1]
                dp[i][j]=max(curSum, dp[i][j+1], dp[i+1][j])
        return dp[0][0]

        