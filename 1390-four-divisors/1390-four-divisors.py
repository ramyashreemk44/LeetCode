class Solution:
    def sumFourDivisors(self, nums: List[int]) -> int:

        def sumFourDivisor(num):
            sumv,count=0,0
            n=int((num**0.5))
            for i in range(1, n+1):
                if num%i==0:
                    sumv+=i
                    count+=1
                    if num/i!=n:
                        sumv+=num//i
                        count+=1
            if count==4: return sumv
            return 0

        result=0

        for i in nums:
            result+=sumFourDivisor(i)
        return result
