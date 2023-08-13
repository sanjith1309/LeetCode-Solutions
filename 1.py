class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        b=[]
        for i in range(0,len(nums)):
            for j in range(0,len(nums)):
                if i!=j:
                    if nums[i]+nums[j]==target:
                        b.append(i)
                        b.append(j)
        return list(set(b))
