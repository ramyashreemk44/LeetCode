class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        """
        s=str(x)
        mid=len(s)/2
        first_half=s[:mid]
        last_half=s[-mid:][::-1]
        if len(s)==0 | len(s)==1:
            return True
        elif first_half==last_half:
            return True
        else:
            return False
        """
        # Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        if x < 0 or (x % 10 == 0 and x != 0):
            return False

        reversed_half = 0
        while x > reversed_half:
            reversed_half = reversed_half * 10 + x % 10
            x //= 10

        # Check if the first half matches the reversed second half
        return x == reversed_half or x == reversed_half // 10

        