/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {

    let sum = 0;

    // First window
    for(let i = 0; i < k; i++) {
        sum += nums[i];
    }

    let maxsum = sum;

    // Slide the window
    for(let i = k; i < nums.length; i++) {
        sum = sum + nums[i] - nums[i - k];
        maxsum = Math.max(maxsum, sum);
    }

    return maxsum / k;
};