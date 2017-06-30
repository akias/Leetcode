
public class Test33SearchInRotatedArray {
	    public int search(int[] nums, int target) {
	        int min = 0,max = nums.length-1,mid = 0;
	        while(min <= max){
	            mid = (min + max)/2;
	            System.out.println("--------"+mid+"--------");
	            if(nums[mid] == target){
	                return mid;
	            }
	            if(nums[min] <= nums[mid]){
	            	System.out.println("left");
	                if(nums[min] <= target && target < nums[mid]){
	                    max = mid - 1;
	                }else{
	                    min = mid + 1;
	                }
	            }else{
	            	System.out.println("right");
	                if(nums[mid] <target && target <= nums[max]){
	                    min = mid + 1;
	                }else{
	                    max = mid - 1;
	                }
	            }
	            
	        }
	        return -1;
	}
}
