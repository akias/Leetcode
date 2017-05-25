
public class Test35SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while(low <= high){
			int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
		}
		return low;
	}


public int searchInsert2(int[] nums, int target) {
    int a=0;
    if(target>nums[nums.length-1]){
        a=nums.length;
    }
    else if(target<nums[0]){
        a=0;
    }else{
    for(int i=0;i<nums.length;i++){
        if(target==nums[i]){
            a=i;
        }else if(target>nums[i]&&target<nums[i+1]){
            a=i+1;
        }
    }
    }
    return a;

}
}