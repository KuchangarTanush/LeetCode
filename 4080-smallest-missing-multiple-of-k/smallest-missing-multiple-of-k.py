class Solution(object):
    def missingMultiple(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        i=1
        while True:
            ans=i*k
            if ans not in nums:
                return ans
            i+=1