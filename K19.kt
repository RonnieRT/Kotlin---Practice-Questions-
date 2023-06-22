class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var i = 0
        var j = nums.size-1

        if (nums[i] >= target) return i
        if (nums[j] == target) return j
        else if (nums[j] < target) return j+1

        while (j >= i) {
            val mid: Int = i + (j - i)/2
            if (nums[mid] == target) return mid
            else if (nums[mid] > target) j = mid - 1
            else i = mid + 1
        }

        return i
    }
}
