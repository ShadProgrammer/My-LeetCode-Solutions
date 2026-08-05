class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1; ans[1] = -1;

        if (nums.length == 0){
            return ans;
        }
        else if (nums.length == 1){
            int present = (nums[0] == target) ? 0 : -1;
            ans[0] = present; ans[1] = present;
            return ans;
        }
        else if (nums.length == 2){
            if (target == nums[0]){
                if (target == nums[1]){
                    ans[0] = 0; ans[1] = 1;
                    return ans;
                }
                else{
                    ans[0] = ans[1] = 0;
                     return ans;
                }
            }
            else if (target == nums[1]){
                ans[0] = ans[1] = 1;
                return ans;
            }
            else{
                return ans;
            }
        }

        // first pos of element
        int low = 0; int high = nums.length-1;
        while (low <= high){
            int mid = (low+high)/2;

            if (nums[mid] == target){
                if (mid > 0 && nums[mid - 1] == target){
                    high = mid-1;
                }
                else{
                    ans[0] = ans[1] = mid;
                    break;
                }
            }
            else if(target < nums[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        // last pos of element
        low = 0; high = nums.length-1;
        while (low <= high){
            int mid = (low+high)/2;

            if (nums[mid] == target){
                if (mid < nums.length - 1 && nums[mid + 1] == target){
                    low = mid+1;
                }
                else{
                    ans[1] = mid;
                    break;
                }
            }
            else if(target < nums[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna