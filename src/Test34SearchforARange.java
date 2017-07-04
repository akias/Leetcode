
public class Test34SearchforARange {
	public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int min = 0,max = nums.length-1;

        result[0] = FindFirst(nums,target,min,max);
        result[1] = FindLast(nums,target,min,max);
        return result;
    }

    private int FindFirst(int[] nums, int target,int min,int max){
        int result = -1;
        while(min <= max){
            int mid = (min + max) / 2;
            if(nums[mid] >= target){
                max = mid-1;
            }else{
                min = mid+1;
            }
            if(nums[mid] == target){
            result = mid;
        }
        }
        return result;
    }

    private int FindLast(int[] nums,int target,int min,int max){
        int result = -1;
        while(min <= max){
            int mid = (min + max) / 2;
            if(nums[mid] <= target){
                min = mid + 1;
            }else{
                max = mid - 1;
            }
            if(nums[mid] == target){
            result = mid;
            }
           }
        return result;
    }
}
