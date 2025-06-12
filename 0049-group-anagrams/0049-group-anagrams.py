class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        result=defaultdict(list)
        for word in strs:
            charArray=[0]*26
            for char in word:
                charArray[ord(char)-ord("a")]+=1
            
            result[tuple(charArray)].append(word)
        return result.values()
        