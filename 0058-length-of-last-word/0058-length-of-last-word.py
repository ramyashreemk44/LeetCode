class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        index=0
        reverseds=s[::-1]
        for i in range(len(reverseds)):
            if reverseds[i] !=" ":
                index+=1
            elif index==0:
                continue
            else : return index
        return index