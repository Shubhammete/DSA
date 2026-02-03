# https://leetcode.com/problems/contains-duplicate/description/

# Brute Force 
# Time complexity - O(n^2)
# Space Complexity - O(1)
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        for i in range(0,len(nums)):
            ele = nums[i]
            for j in range(i+1,len(nums)):
                if ele == nums[j]:
                    return True
        return False

# Best case
# Time Complexity -  O(n)
# Space complexity - O(n)
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        numset = set(nums)
        if len(numset) == len(nums):
            return False
        return True

