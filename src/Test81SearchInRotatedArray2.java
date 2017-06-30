
public class Test81SearchInRotatedArray2 {
	public boolean search(int[] nums, int target) {
        int min = 0, max = nums.length-1, mid = -1;
        while(min<=max){
            mid = ( min + max ) / 2;
            if (nums[mid] == target) {
                return true;
            }
            //If we know for sure right side is sorted or left side is unsorted
            if(nums[mid] < nums[max] || nums[mid] < nums[min]){
                if(nums[mid] < target && target <= nums[max]){
                    min = mid + 1;
                }else{
                    max = mid - 1;
                }
                //If we know for sure left side is sorted or left side is unsorted
            }else if(nums[mid] > nums[min] || nums[mid] > nums[max]){
                if(nums[mid] > target && nums[min]<=target){
                    max = mid - 1;
                }else{
                    min = mid + 1;
                }
            //If we get here, that means nums[start] == nums[mid] == nums[end], then shifting out
            //any of the two sides won't change the result but can help remove duplicate from
            //consideration, here we just use end-- but left++ works too
            }else{
                max--;
            }
        }
        return false;
    }
}
