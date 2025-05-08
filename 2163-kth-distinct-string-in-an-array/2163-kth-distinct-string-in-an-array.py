class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        
        dictDistinctValues={}
        count=0
        for val in arr:
            dictDistinctValues[val]=dictDistinctValues.get(val,0)+1
        
        for key,val in dictDistinctValues.items():
            if val==1:
                count+=1
                if k==count:
                    return key
        return ""
        
        