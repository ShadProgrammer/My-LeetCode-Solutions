class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0; int high = nums.length-1;

        while (low <= high){
            int mid = (low+high)/2;

            if (target == nums[mid]){
                return true;
            }
            else if (nums[low] <= nums[mid]){
                if (nums[low] == nums[mid]){
                    low++;
                    continue;
                }
                if (nums[low] <= target && target <= nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if (nums[mid] == nums[high]){
                    high--;
                    continue;
                }
                if (nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna