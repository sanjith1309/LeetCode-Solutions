class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        l=len(nums)-1
        for i in range(k):
            a=nums[l]
            nums.insert(0,a)
            nums.pop()
