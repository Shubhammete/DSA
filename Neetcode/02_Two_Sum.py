# https://leetcode.com/problems/two-sum/

# If list is sorted
a = [1,2,3,4,5,6,7]
target = 7
i = 0
j = len(a) - 1

while(i<j):
    print(f"Entering loop i = {i} and j = {j}")
    print(a[i]+a[j])
    if(a[i]+a[j]==target):
        print([i,j])
        break
    elif(a[i]+a[j]<target):
        print("target is more")
        i = i + 1
    elif(a[i]+a[j]>target):
        print("target is less")
        j = j - 1
    else:
        print([])
        break


# Non sorted array using hashmap
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        s = {}
        for i in range(len(nums)):
            compl = target - nums[i]
            if compl in s:
                return [s[compl], i]
            s[nums[i]] = i
        return []
